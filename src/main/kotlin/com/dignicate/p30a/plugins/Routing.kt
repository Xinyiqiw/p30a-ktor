package com.dignicate.p30a.plugins

import io.ktor.resources.Resource
import io.ktor.server.application.*
import io.ktor.server.resources.get
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get<Root> {
            call.respondText("Hello World!")
        }
        get<Root.Items.List> {
            // TODO: return list of items
            call.respondText("List of items")
        }
        get<Root.Items.Id> {
            // TODO: return item by id
            call.respondText("Item by id")
        }
    }
}

@Resource("/")
private class Root {
    @Resource("/item")
    class Items {
        @Resource("/list")
        class List(val parent: Items = Items(), val limit: Int? = 5)
        @Resource("/{id}")
        class Id(val parent: Items = Items(), val id: Long)
    }
}



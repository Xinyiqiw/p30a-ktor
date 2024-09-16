package com.dignicate.p30a.plugins

import io.ktor.http.*
import io.ktor.resources.Resource
import io.ktor.server.application.*
import io.ktor.server.resources.get
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get<Root> {
            call.respondRedirect(Url("https://dignicate.com"))
        }
        get<Root.Automobile.Companies> {
            // TODO: need to implement
        }
    }
}

@Resource("/")
private class Root {
//    @Resource("/item")
//    class Items {
//        @Resource("/list")
//        class List(val parent: Items = Items(), val limit: Int? = 5)
//        @Resource("/{id}")
//        class Id(val parent: Items = Items(), val id: Long)
//    }
    @Resource("/automobile")
    class Automobile {
        @Resource("/companies")
        class Companies(val parent: Automobile = Automobile(), val limit: Int = 10, val page: Int = 1)
    }
}

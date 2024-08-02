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
    }
}

@Resource("/")
private class Root

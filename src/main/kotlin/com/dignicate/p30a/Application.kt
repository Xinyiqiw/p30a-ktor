package com.dignicate.p30a

import com.dignicate.p30a.plugins.configureRouting
import io.ktor.resources.Resource
import io.ktor.server.application.*
import io.ktor.server.resources.Resources

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused") // Referenced in application.conf
fun Application.module() {
    install(Resources)
    configureRouting()
}

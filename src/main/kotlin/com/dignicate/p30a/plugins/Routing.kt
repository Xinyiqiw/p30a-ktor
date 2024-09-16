package com.dignicate.p30a.plugins

import com.dignicate.p30a.controller.AutomobileController
import io.ktor.http.*
import io.ktor.resources.Resource
import io.ktor.server.application.*
import io.ktor.server.resources.get
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.core.parameter.parametersOf
import org.koin.java.KoinJavaComponent.getKoin

fun Application.configureRouting() {
    routing {
        get<Root> {
            call.respondRedirect(Url("https://dignicate.com"))
        }
        get<Root.Automobile.Companies> { companies ->
            // Koin から Controller を DI で取得
            val controller: AutomobileController = getKoin().get<AutomobileController> { parametersOf(call) }

            // Controller を呼び出して処理を実行
            controller.getCompanies(companies.limit, companies.page)
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

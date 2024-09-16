package com.dignicate.p30a.di

import com.dignicate.p30a.controller.AutomobileController
import com.dignicate.p30a.domain.automobile.AutomobileRepository
import com.dignicate.p30a.domain.automobile.GetCompaniesUseCase
import com.dignicate.p30a.domain.automobile.MockAutomobileRepository
import io.ktor.server.application.*
import org.koin.dsl.module


val serviceModule = module {
    single<AutomobileRepository> { MockAutomobileRepository() }
    factory { GetCompaniesUseCase(get()) }
    factory { (call: ApplicationCall) -> AutomobileController(call, get()) }
}

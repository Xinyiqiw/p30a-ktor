package com.dignicate.p30a.controller

import com.dignicate.p30a.domain.automobile.GetCompaniesUseCase
import io.ktor.server.application.*
import io.ktor.server.response.*

class AutomobileController(
    private val call: ApplicationCall,
    private val getCompaniesUseCase: GetCompaniesUseCase
) {
    suspend fun getCompanies(limit: Int, page: Int) {
        val companies = getCompaniesUseCase.execute(limit, page)
        call.respond(companies)
    }
}

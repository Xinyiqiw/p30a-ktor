package com.dignicate.p30a.domain.automobile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Company(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: String,
    @SerialName("country")
    val country: String,
    @SerialName("founded_year")
    val foundedYear: Int
)

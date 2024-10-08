package com.dignicate.p30a.domain.automobile

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Company(
    @SerialName("id")
    val id: Int,
    @SerialName("name")
    val name: LocalizedString,
    @SerialName("country")
    val country: LocalizedString,
    @SerialName("founded_year")
    val foundedYear: Int
)

@Serializable
data class LocalizedString(
    @SerialName("en")
    val en: String,
    @SerialName("ja")
    val ja: String
)

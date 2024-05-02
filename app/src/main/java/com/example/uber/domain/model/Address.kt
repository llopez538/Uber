package com.example.uber.domain.model

data class Address (
    val street: String,
    val city: String,
    val state: String,
    val zip: String,
    val location: Location
)
package com.example.uber.domain.model

data class Driver(
    val email: String,
    val name: String,
    val lastName: String,
    val dateOfBirth: Long,
    val identity: Int,
    val cellphone: String,
    val transportation: Transportation,
    val address: Address
)

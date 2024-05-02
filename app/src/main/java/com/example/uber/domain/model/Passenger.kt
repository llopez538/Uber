package com.example.uber.domain.model

data class Passenger(
    val name: String,
    val lastName: String,
    val dateOfBirth: Long,
    val identity: Int,
    val cellphone: String,
    val address: Address
)

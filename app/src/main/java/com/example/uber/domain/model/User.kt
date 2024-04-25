package com.example.uber.domain.model

data class User(
    val email: String,
    val fullName: String,
    val dateOfBirth: Long,
    val identity: Int,
    val address: String,
    val cellphone: String,
)

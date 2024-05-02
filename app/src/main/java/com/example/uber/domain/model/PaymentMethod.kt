package com.example.uber.domain.model

data class PaymentMethod(
    val name: String,
    val description: String,
    val type: String,
    val active: Boolean,
)

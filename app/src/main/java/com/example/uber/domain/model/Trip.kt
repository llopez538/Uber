package com.example.uber.domain.model

data class Trip(
    val distance: Long,
    val initRoute: Location,
    val lastRoute: Location,
    val driver: Driver,
    val rate: Rate,
    val method: PaymentMethod
)

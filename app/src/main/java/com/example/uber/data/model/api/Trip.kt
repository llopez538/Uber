package com.example.uber.data.model.api

import com.example.uber.domain.model.PaymentMethod
import com.example.uber.domain.model.Rate
data class Trip(
    val distance: Long,
    val initLat: Double,
    val initLong: Double,
    val lastLat: Double,
    val lastLong: Double,
    val driver: User,
    val rate: Float,
    val method: String
)

package com.example.uber.domain.model

data class Trip(
    val distance: Long,
    val initRoute: Map,
    val lastRoute: Map,
    val driver: Driver,
)

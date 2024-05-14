package com.example.uber.data.model.api

data class Location(
    val lat: Double,
    val lng: Double,
    val address: String,
    val city: String,
    val state: String,
    val zip: String,
    val country: String,
)

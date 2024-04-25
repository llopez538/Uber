package com.example.uber.domain.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Map (
    val place: String,
    val icon: String,
    val lat: Double,
    val long: Double,
)
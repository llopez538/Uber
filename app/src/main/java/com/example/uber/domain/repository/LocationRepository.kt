package com.example.uber.domain.repository

import com.example.uber.domain.model.Location

interface LocationRepository {
    suspend fun getLocation(): Location
}
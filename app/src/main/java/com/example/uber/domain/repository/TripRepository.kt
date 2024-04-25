package com.example.uber.domain.repository

import com.example.uber.domain.model.Map
import com.example.uber.domain.model.Trip

interface TripRepository {
    suspend fun get(): List<Trip>
    suspend fun update(id: String): Trip
    suspend fun search(map: Map): List<Trip>
    suspend fun cancel(id: String)
}
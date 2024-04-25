package com.example.uber.domain.repository

import com.example.uber.domain.model.Map
import com.example.uber.domain.model.Passenger

interface PassengerRepository {
    suspend fun getPassenger(email: String): Passenger
    suspend fun getPassengers(location: Map): List<Passenger>
}
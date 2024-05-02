package com.example.uber.domain.repository

import com.example.uber.domain.model.Location
import com.example.uber.domain.model.Passenger

interface PassengerRepository {
    suspend fun getPassenger(phone: String): Passenger
    suspend fun getPassengers(location: Location): List<Passenger>
}
package com.example.uber.domain.repository

import com.example.uber.domain.model.Address
import com.example.uber.domain.model.Driver
import com.example.uber.domain.model.Location
import com.example.uber.domain.model.Passenger
import com.example.uber.domain.model.Rate
import com.example.uber.domain.model.Trip
import com.example.uber.domain.model.User

interface TripRepository {
    suspend fun getTrip(user: User, from: Location, to: Location): Trip
    suspend fun calDistance(start: Location, end: Location): Double
    suspend fun update(location: Location): Address
    suspend fun takeTrip(passenger: String, driver: String): Trip
    suspend fun rateTrip(driver: Driver, passenger: Passenger): Rate
    suspend fun cancel(id: String)
}
package com.example.uber.domain.usecase

import com.example.uber.domain.model.Location
import com.example.uber.domain.model.Trip
import com.example.uber.domain.repository.LocationRepository
import com.example.uber.domain.repository.TripRepository
import com.example.uber.domain.repository.UserRepository

class SearchTripUseCase(
    private val tripRepository: TripRepository,
    private val userRepository: UserRepository,
    private val locationRepository: LocationRepository,
) {
    suspend fun execute(destination: Location): Trip {
        val user = this.userRepository.getCurrentUser()
        val userLocation = this.locationRepository.getLocation()
        val trip = this.tripRepository.getTrip(
            user = user,
            from = userLocation,
            to = destination
        )

        return trip
    }
}
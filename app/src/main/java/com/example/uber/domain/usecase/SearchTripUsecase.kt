package com.example.uber.domain.usecase

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import com.example.uber.domain.model.Map
import com.example.uber.domain.model.Trip
import com.example.uber.domain.repository.PassengerRepository
import com.example.uber.domain.repository.TripRepository
import com.example.uber.domain.repository.UserRepository

class SearchTripUseCase(
    private val tripRepository: TripRepository,
    private val userRepository: UserRepository,
    private val passengerRepository: PassengerRepository
) {
    suspend fun execute(): List<Trip> {
        val user = this.userRepository.getUser("pedrito@you.com")
        val passenger = this.passengerRepository.getPassenger(user.email)
        val trips = this.tripRepository.search(
            passenger.map
        )

        return trips
    }
}
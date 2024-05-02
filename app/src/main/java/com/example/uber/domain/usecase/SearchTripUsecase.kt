package com.example.uber.domain.usecase

import com.example.uber.domain.model.Driver
import com.example.uber.domain.repository.DriverRepository
import com.example.uber.domain.repository.PassengerRepository
import com.example.uber.domain.repository.TripRepository

class SearchTripUseCase(
    private val tripRepository: TripRepository,
    private val driverRepository: DriverRepository,
    private val passengerRepository: PassengerRepository,
) {
    suspend fun execute(): List<Driver> {
        val passenger = this.passengerRepository.getPassenger("+577543456789")
        val locationPassenger = this.tripRepository.getLocation(passenger.address.location)
        val listDriver = this.driverRepository.getDrivers(locationPassenger)

        return listDriver
    }
}
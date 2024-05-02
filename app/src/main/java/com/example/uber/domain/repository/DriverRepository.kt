package com.example.uber.domain.repository

import com.example.uber.domain.model.Address
import com.example.uber.domain.model.Driver

interface DriverRepository {
    suspend fun getDrivers(address: Address): List<Driver>
    suspend fun getDriver(phone: String): Driver

}
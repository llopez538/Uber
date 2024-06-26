package com.example.uber.domain.repository

import com.example.uber.domain.model.Location
import com.example.uber.domain.model.User

interface UserRepository {
    suspend fun getUser(email: String): User
    suspend fun getCurrentUser(): User
    suspend fun getUsers(address: Location): List<User>
    suspend fun updateUser(user: User): User
    suspend fun edit(email: String): User
    suspend fun delete(email: String)
}
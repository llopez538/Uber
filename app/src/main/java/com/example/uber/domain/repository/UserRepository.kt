package com.example.uber.domain.repository

import com.example.uber.domain.model.Map
import com.example.uber.domain.model.User

interface UserRepository {
    suspend fun getUser(email: String): User
    suspend fun getUsers(address: Map): List<User>
    suspend fun updateUser(user: User): User
    suspend fun edit(email: String): User
    suspend fun delete(email: String)
}
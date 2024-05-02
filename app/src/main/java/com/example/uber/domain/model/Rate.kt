package com.example.uber.domain.model

import android.icu.util.CurrencyAmount

data class Rate(
    val amount: Double,
    val currency: CurrencyAmount,
    val date: String,
    val success: Boolean,
    val distance: Double,
    val time: String,
)

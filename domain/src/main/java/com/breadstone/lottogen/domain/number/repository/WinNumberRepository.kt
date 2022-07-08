package com.breadstone.lottogen.domain.number.repository

import com.breadstone.lottogen.domain.number.entity.WinNumber
import kotlinx.coroutines.flow.Flow

interface WinNumberRepository {
    suspend fun getLatest() : Flow<WinNumber>
}
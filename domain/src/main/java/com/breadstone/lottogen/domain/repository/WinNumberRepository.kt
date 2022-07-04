package com.breadstone.lottogen.domain.repository

import com.breadstone.lottogen.domain.entity.WinNumber
import kotlinx.coroutines.flow.Flow

interface WinNumberRepository {
    suspend fun getLatest() : Flow<WinNumber>
}
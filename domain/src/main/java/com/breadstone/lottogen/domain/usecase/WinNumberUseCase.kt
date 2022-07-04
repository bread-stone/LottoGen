package com.breadstone.lottogen.domain.usecase

import com.breadstone.lottogen.domain.entity.WinNumber
import kotlinx.coroutines.flow.Flow


interface WinNumberUseCase {
    suspend fun getLatest(): Flow<WinNumber>
}
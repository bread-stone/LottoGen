package com.breadstone.lottogen.domain.number.usecase

import com.breadstone.lottogen.domain.number.entity.WinNumber
import kotlinx.coroutines.flow.Flow


interface WinNumberUseCase {
    suspend fun getLatest(): Flow<WinNumber>
}
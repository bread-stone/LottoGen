package com.breadstone.lottogen.domain.number.usecase

import com.breadstone.lottogen.domain.number.entity.WinNumber
import com.breadstone.lottogen.domain.number.repository.WinNumberRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WinNumberUseCaseImpl @Inject constructor(
    private val winNumberRepository: WinNumberRepository
) : WinNumberUseCase {
    override suspend fun getLatest(): Flow<WinNumber> =
        winNumberRepository.getLatest()
}
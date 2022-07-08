package com.breadstone.lottogen.data.number.datasource.local

import com.breadstone.lottogen.data.number.dto.WinNumberDto

interface WinNumberLocalDataSource {
    suspend fun insert(dto: WinNumberDto)

    suspend fun getLatestDrwNo(): Int

    suspend fun getLatestWinNumber(drwNo: Int): WinNumberDto

    suspend fun getAll(): List<WinNumberDto>
}
package com.breadstone.lottogen.data.number.datasource.remote

import com.breadstone.lottogen.data.number.dto.WinNumberDto

interface WinNumberRemoteDataSource {
    suspend fun getWinNumber(drwNo : Int) : WinNumberDto
}
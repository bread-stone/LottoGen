package com.breadstone.lottogen.data.number.datasource.remote

import com.breadstone.lottogen.data.api.ApiService
import com.breadstone.lottogen.data.number.dto.WinNumberDto
import javax.inject.Inject

class WinNumberRemoteDataSourceImpl @Inject constructor(
   private val apiService: ApiService
) : WinNumberRemoteDataSource {
    override suspend fun getWinNumber(drwNo : Int) : WinNumberDto {
        return apiService.getWinNumber(drwNo)
    }
}
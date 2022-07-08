package com.breadstone.lottogen.data.number.datasource.local

import com.breadstone.lottogen.data.number.dao.WinNumberDao
import com.breadstone.lottogen.data.number.dto.WinNumberDto
import javax.inject.Inject

class WinNumberLocalDataSourceImpl @Inject constructor(
    private val winNumberDao: WinNumberDao
) : WinNumberLocalDataSource {
    override suspend fun insert(dto: WinNumberDto) =
        winNumberDao.insert(dto)

    override suspend fun getLatestDrwNo(): Int =
        winNumberDao.getLatestDrwNo()

    override suspend fun getLatestWinNumber(drwNo: Int): WinNumberDto =
        winNumberDao.get(drwNo)

    override suspend fun getAll(): List<WinNumberDto> =
        winNumberDao.getAll()
}
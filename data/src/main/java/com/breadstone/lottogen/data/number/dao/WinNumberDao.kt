package com.breadstone.lottogen.data.number.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.breadstone.lottogen.data.number.dto.WinNumberDto

@Dao
interface WinNumberDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(dto: WinNumberDto)

    @Query("SELECT max(drwNo) FROM WinNumber")
    suspend fun getLatestDrwNo(): Int

    @Query("SELECT * FROM WinNumber WHERE drwNo=:drwNo")
    suspend fun getLatestDrwNo(drwNo: Int): WinNumberDto

    @Query("SELECT * FROM WinNumber")
    suspend fun getAll(): List<WinNumberDto>
}
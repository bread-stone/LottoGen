package com.breadstone.lottogen.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.breadstone.lottogen.data.number.dao.WinNumberDao
import com.breadstone.lottogen.data.number.dto.WinNumberDto

@Database(
    entities = [WinNumberDto::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun winNumberDao(): WinNumberDao
}
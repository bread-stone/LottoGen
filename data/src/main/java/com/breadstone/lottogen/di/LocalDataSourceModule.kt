package com.breadstone.lottogen.di

import com.breadstone.lottogen.data.number.dao.WinNumberDao
import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSource
import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalDataSourceModule {
    @Provides
    @Singleton
    fun provideWinNumberLocalDataSource(
        winNumberDao: WinNumberDao
    ): WinNumberLocalDataSource = WinNumberLocalDataSourceImpl(winNumberDao)
}

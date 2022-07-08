package com.breadstone.lottogen.di

import com.breadstone.lottogen.data.api.ApiService
import com.breadstone.lottogen.data.number.dao.WinNumberDao
import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSource
import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSourceImpl
import com.breadstone.lottogen.data.number.datasource.remote.WinNumberRemoteDataSource
import com.breadstone.lottogen.data.number.datasource.remote.WinNumberRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteDataSourceModule {
    @Provides
    @Singleton
    fun provideWinNumberRemoteDataSource(
        apiService: ApiService
    ): WinNumberRemoteDataSource = WinNumberRemoteDataSourceImpl(apiService)
}

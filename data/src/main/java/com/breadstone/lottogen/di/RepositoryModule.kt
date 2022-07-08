package com.breadstone.lottogen.di

import com.breadstone.lottogen.data.number.datasource.local.WinNumberLocalDataSource
import com.breadstone.lottogen.data.number.datasource.remote.WinNumberRemoteDataSource
import com.breadstone.lottogen.data.number.repository.WinNumberRepositoryImpl
import com.breadstone.lottogen.domain.number.repository.WinNumberRepository
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Reusable
    fun provideWinNumberRepository(
        local: WinNumberLocalDataSource,
        remote: WinNumberRemoteDataSource
    ): WinNumberRepository =
        WinNumberRepositoryImpl(local, remote)

}

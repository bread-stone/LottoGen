package com.breadstone.lottogen.di

import com.breadstone.lottogen.domain.repository.WinNumberRepository
import com.breadstone.lottogen.domain.usecase.WinNumberUseCase
import com.breadstone.lottogen.domain.usecase.WinNumberUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DomainModule {

    @Provides
    @Reusable
    fun provideWinNumberUseCase(
        winNumberRepository: WinNumberRepository
    ): WinNumberUseCase = WinNumberUseCaseImpl(winNumberRepository)


}

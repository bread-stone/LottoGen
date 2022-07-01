package com.breadstone.lottogen.di

import com.breadstone.lottogen.presentation.MainViewModel
import com.breadstone.lottogen.presentation.numlist.NumListViewModel
import com.breadstone.lottogen.presentation.store.StoreViewModel
import com.breadstone.lottogen.presentation.winnum.WinNumberViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class ViewModelsModule {
    @Provides
    fun provideMainViewModel(
    ) = MainViewModel()

    @Provides
    fun provideWinNumberViewModel(
    ) = WinNumberViewModel()

    @Provides
    fun provideNumListViewModel(
    ) = NumListViewModel()

    @Provides
    fun provideStoreViewModel(
    ) = StoreViewModel()
}

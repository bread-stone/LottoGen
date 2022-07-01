package com.breadstone.lottogen.di

import android.content.Context
import androidx.room.Room
import com.breadstone.lottogen.data.number.dao.WinNumberDao
import com.breadstone.lottogen.data.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context
    ): AppDatabase = Room
        .databaseBuilder(context, AppDatabase::class.java, "lottogen.db")
        .build()

    @Provides
    @Singleton
    fun providePictureLikeDao(appDatabase: AppDatabase): WinNumberDao =
        appDatabase.winNumberDao()

}
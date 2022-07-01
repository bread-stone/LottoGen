package com.breadstone.lottogen

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class LottoGenApp : Application() {
    override fun onCreate() {
        super.onCreate()
        //Timber.plant(Timber.DebugTree())
    }
}
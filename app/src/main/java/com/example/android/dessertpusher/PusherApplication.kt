package com.example.android.dessertpusher
import android.app.Application
import androidx.databinding.library.BuildConfig
import timber.log.Timber

class PusherApplication :Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
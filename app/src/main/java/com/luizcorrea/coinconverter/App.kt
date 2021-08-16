package com.luizcorrea.coinconverter

import android.app.Application
import com.luizcorrea.coinconverter.data.di.DataModules
import com.luizcorrea.coinconverter.domain.di.DomainModule
import com.luizcorrea.coinconverter.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModules.load()
        DomainModule.load()
        PresentationModule.load()
    }
}
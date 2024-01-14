package com.nodz.aview

import android.app.Application

class AviewApplication : Application() {
    override fun onCreate() {
        super.onCreate()

//        startKoin {
//            androidLogger()
//            androidContext(this@MainApplication)
//            modules(appModule)
//        }

    }
}
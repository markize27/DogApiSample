package com.example.dogapisample

import android.app.Application
import com.example.dogapisample.di.component.Component
import com.example.dogapisample.di.component.DaggerComponent


class DogApiSampleApp: Application() {


    companion object {
        lateinit var daggerComponent: Component
    }

    override fun onCreate() {
        super.onCreate()
        daggerComponent = DaggerComponent.builder().application(this).build()
    }
}
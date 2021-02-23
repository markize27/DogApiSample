package com.example.dogapisample.di.component

import android.app.Application
import com.example.dogapisample.ui.main.view.MainActivity
import com.example.dogapisample.di.module.AppModule
import com.example.dogapisample.di.module.RetrofitModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        AppModule::class,
        RetrofitModule::class]
)
@Singleton
interface Component {


    fun inject(mainActivity: MainActivity)


    @Component.Builder
    interface Builder {
        fun build(): com.example.dogapisample.di.component.Component

        @BindsInstance
        fun application(application: Application): Builder
    }
}
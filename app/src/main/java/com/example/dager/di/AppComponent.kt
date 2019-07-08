package com.example.dager.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(modules = [ AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class ])
interface AppComponent: AndroidInjector<MyApplication> {

    //interface Builder {
      //  @BindsInstance
      //  fun application(application: Application): AppComponent.Builder
       // fun build(): AppComponent
    //}

    fun inject()
}
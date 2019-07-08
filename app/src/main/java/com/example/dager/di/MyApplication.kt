package com.example.dager.di

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MyApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>  =
        DaggerAppComponent
            .builder() //.application(this)
            .build()


}



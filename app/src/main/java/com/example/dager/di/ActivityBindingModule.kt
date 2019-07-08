package com.example.dager.di

import com.example.dager.activity.InjectConstructorActivity
import com.example.dager.activity.Main2Activity
import com.example.dager.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [AppModule::class])
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AppModule::class])
    abstract fun main2Activity(): Main2Activity

    @ContributesAndroidInjector(modules = [AppModule::class])
    abstract fun injectConstructorActivity(): InjectConstructorActivity


}
package com.example.dager.di

import com.example.dager.InjectConstructorActivity
import com.example.dager.Main2Activity
import com.example.dager.MainActivity
import com.example.dager.utils.MathUtils
import com.example.dager.utils.StringUtils
import dagger.Binds
import dagger.MapKey
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
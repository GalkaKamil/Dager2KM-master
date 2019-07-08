//package com.example.dager.di
//
//import android.content.Context
//import dagger.BindsInstance
//import dagger.Component
//import dagger.android.support.AndroidSupportInjectionModule
//
//
//@Component(modules = [ AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class ])
//interface AppComponent3 {
//
//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance applicationContext: Context): AppComponent3
//    }
//
//    fun inject(app: MyApplication3)
//}
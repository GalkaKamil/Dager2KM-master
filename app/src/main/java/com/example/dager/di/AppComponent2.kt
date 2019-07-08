//package com.example.dager.di
//
//import android.app.Application
//import dagger.BindsInstance
//import dagger.Component
//import dagger.android.support.AndroidSupportInjectionModule
//
//
//@Component(modules = [ AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class ])
//interface AppComponent2 {
//
//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        fun application(application: Application): Builder
//
//        fun build(): AppComponent2
//    }
//
//    fun inject(app: MyApplication2)
//
//}
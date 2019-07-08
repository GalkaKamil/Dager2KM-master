package com.example.dager.di

import com.example.dager.MyApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


@Component(modules = [AppModule::class, AndroidSupportInjectionModule::class, ActivityBindingModule::class])
interface AppComponent : AndroidInjector<MyApplication> {

    //      brakujaca adnotacja ( z tego powodu nie można było użyć funkcji application z poniższego buildera w klasie MyApplication)
    @Component.Builder
    interface Builder {

        //        Btw:  jako że nigdzie nie providujecie żadnego obiektu który do stworzenia wymaga instancji aplikacji to właściwie
//        jes to zbędne. Przestanie być jeżeli np odkomentujecie w AppModule funkcje provideContext()
//        @BindsInstance
//        fun application(application: Application): Builder
        fun build(): AppComponent
    }

    override fun inject(application: MyApplication)
}
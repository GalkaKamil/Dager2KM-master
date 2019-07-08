package com.example.dager.di

import com.example.dager.utils.MathUtils
import com.example.dager.utils.StringUtils
import dagger.Module
import dagger.Provides


@Module
class AppModule {

    @Provides
    fun provideStringUtils() = StringUtils()

    @Provides
    fun provideMathUtils() = MathUtils()

}
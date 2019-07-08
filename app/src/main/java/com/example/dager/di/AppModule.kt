package com.example.dager.di

import com.example.dager.utils.AwesomeInterface
import com.example.dager.utils.MathUtils
import com.example.dager.utils.SomethingToInject
import com.example.dager.utils.StringUtils
import dagger.Module
import dagger.Provides


@Module
class AppModule {

// przykład provideowania contextu aplikacji. Zwykle po to wlasnie w komponencie jest metoda application()
//    bo dzięki niej dagger wie jak dostarczyc Application, a z application juz dobierzemy sie do contextu
//
//    @Provides
//    fun provideContext(application: Application) = application.applicationContext

    @Provides
    fun provideStringUtils() = StringUtils()

    @Provides
    fun provideMathUtils() = MathUtils()

//  jeżeli dagger zna wszytskie zaleznosci ktore wstrzykuje przez konstruktor tak jak to jest w klasie SomethingToInject i dostarczamy
//    dokładnie instancje tej klasy ( za dwukropikiem jest SomethingToInject) to nawet nie musimy tego providowac wiec mozna
//    smialo usunac ponizszego provide'a
    @Provides
    fun provideSomethingToInject(stringUtils: StringUtils): SomethingToInject =
    SomethingToInject(stringUtils)

//    inaczej to wyglada w przpadku kiedy probujemy dostarczyc implementacje jakiegos interfejsu badz klasy abstrakcyjnej, wowczas jezeli usuniemy
//    ponizszego provide'a to dagger nie będzie juz wiedzial jak stworzyc obiekt SomethingToInject ktory implemenuje AwesomeInterface.
//    Wiec jezeli zrobimy np: @Inject lateinit var somethingToInject2: AwesomeInterface to apka sie nie skompiluje
    @Provides
    fun provideAwesomeInterface(stringUtils: StringUtils): AwesomeInterface =
    SomethingToInject(stringUtils)

}
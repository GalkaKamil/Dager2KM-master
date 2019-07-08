package com.example.dager.utils

import android.util.Log
import javax.inject.Inject

//przykald wtrzykiwania zaleznosci przez konstruktor. Interface AwesomeInterface nie jest oczywiscie konieczny. Dalem go dla zobrazowania innego przykladu
// wiecej o tym przykladzie w AppModule
class SomethingToInject @Inject constructor(

    private val stringUtils: StringUtils

) : AwesomeInterface {

    override fun tiruRiru() {
        Log.d("Metoda interface'u", "Nie robię nic")
    }

    fun doSomething(string1: String, string2: String): String {
        return stringUtils.add(string1, string2)
    }
}


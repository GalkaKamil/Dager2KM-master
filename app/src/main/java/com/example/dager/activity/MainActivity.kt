package com.example.dager.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.example.dager.R
import com.example.dager.utils.AwesomeInterface
import com.example.dager.utils.SomethingToInject
import com.example.dager.utils.StringUtils
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var stringUtils: StringUtils

    @Inject
    lateinit var somethingToInject: SomethingToInject

    @Inject
    lateinit var somethingToInject2: AwesomeInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debtes", stringUtils.add("Tomek", "Kamil"))

        Log.d("constructoInjection", somethingToInject.doSomething("Rafał", "Kamil"))

        somethingToInject2.tiruRiru()

        Thread.sleep(3000)

        startActivity(Intent(this, Main2Activity::class.java))

    }
}

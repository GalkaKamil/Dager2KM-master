package com.example.dager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.dager.di.DaggerAppComponent
import com.example.dager.di.MyApplication
import com.example.dager.utils.StringUtils
import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity


class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var stringUtils: StringUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debtes", stringUtils.add("Tomek", "Kamil"))



        Thread.sleep(3000)

        startActivity(Intent(this, Main2Activity::class.java))

    }
}

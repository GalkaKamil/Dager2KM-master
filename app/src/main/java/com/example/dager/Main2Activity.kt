package com.example.dager

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import com.example.dager.di.DaggerAppComponent
import com.example.dager.di.MyApplication
import com.example.dager.utils.MathUtils
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject

class Main2Activity : DaggerAppCompatActivity() {

    @Inject lateinit var mathUtils: MathUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)

//        fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }

        Log.d("debtes", mathUtils.sum(1, 2).toString())

        Thread.sleep(3000)

       // startActivity(Intent(this, InjectConstructorActivity::class.java))

    }

}

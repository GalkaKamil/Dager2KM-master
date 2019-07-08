package com.example.dager.activity

import android.os.Bundle
import android.util.Log
import com.example.dager.R
import com.example.dager.utils.MathUtils
import kotlinx.android.synthetic.main.activity_main2.*
import javax.inject.Inject


//nie musimy dziedziczyc bo klasie DaggerApplication jeżeli mamy jakies bazowe Activity ktore robi: AndroidInjection.inject(this) w onCreate
class Main2Activity : BaseActivity() {

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

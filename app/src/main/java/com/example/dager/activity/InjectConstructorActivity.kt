package com.example.dager.activity

import android.os.Bundle
import com.example.dager.R
import com.example.dager.utils.MathUtils
import com.example.dager.utils.StringUtils
import com.google.android.material.snackbar.Snackbar
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_inject_constructor.*
import javax.inject.Inject

// TODO Wstrzykiwanie do konstruktora na razie nie dziala
// TODO Nie spotkałem się żeby wstrzykiwać cos do Activity przez konstruktor. Właściwie wydaje mi się że jest to niemożliwe
class InjectConstructorActivity @Inject constructor(
    private val mathUtils: MathUtils,
    private val stringUtils: StringUtils) : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inject_constructor)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "2 + 2 is " + mathUtils.sum(2, 2), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }
    }

}

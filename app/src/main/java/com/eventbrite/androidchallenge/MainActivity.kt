package com.eventbrite.androidchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eventbrite.androidchallenge.ui.events.CharactersInfoFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, CharactersInfoFragment.newInstance())
                .commitNow()
        }
    }
}
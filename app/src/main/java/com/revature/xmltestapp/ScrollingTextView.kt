package com.revature.xmltestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScrollingTextView : AppCompatActivity() {

    private lateinit var mNextScreen: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling_text_view)

        mNextScreen = findViewById(R.id.button_nextscreen)

        mNextScreen.setOnClickListener {

        }
    }
}
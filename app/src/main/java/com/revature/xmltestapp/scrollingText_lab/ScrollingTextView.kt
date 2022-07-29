package com.revature.xmltestapp.scrollingText_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.revature.xmltestapp.R

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
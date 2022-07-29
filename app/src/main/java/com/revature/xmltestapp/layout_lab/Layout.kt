package com.revature.xmltestapp.layout_lab


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.revature.xmltestapp.R
import com.revature.xmltestapp.scrollingText_lab.ScrollingTextView

class Layout : AppCompatActivity() {
    var nCount = 0
    private lateinit var mShowCount:TextView
    private lateinit var mShowToast: Button
    private lateinit var mCountUp:Button
    private lateinit var mZero:Button
    private lateinit var mNextScreen:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)

        mShowCount = findViewById(R.id.text_showcount)
        mShowToast = findViewById(R.id.button_toast)
        mCountUp = findViewById(R.id.button_count)
        mZero = findViewById(R.id.button_zero)
        mNextScreen = findViewById(R.id.button_nextscreen)

        mShowToast.setOnClickListener {
            showToast()
        }
        mCountUp.setOnClickListener {
            countUp()
        }
        mZero.setOnClickListener {
            zeroCount()
        }
        mNextScreen.setOnClickListener {
            launchTextView()
        }

    }

    private fun showToast() {
        Toast.makeText(this, R.string.toast_message,Toast.LENGTH_LONG).show()
    }
    private fun countUp() {
        nCount++
        mShowCount.text = nCount.toString()
    }
    private fun zeroCount(){
        nCount = 0
        mShowCount.text = nCount.toString()
    }
    private fun launchTextView(){
        val intent = Intent(this, ScrollingTextView::class.java)
        startActivity(intent)
    }
}
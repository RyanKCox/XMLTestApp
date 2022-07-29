package com.revature.xmltestapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.revature.xmltestapp.intentNav_HW.ShoppingList
import com.revature.xmltestapp.intentNav_lab.IntentNav
import com.revature.xmltestapp.layout_lab.Layout
import com.revature.xmltestapp.scrollingText_lab.ScrollingTextView

class MainActivity : AppCompatActivity() {
    private lateinit var mLayoutActivity:Button
    private lateinit var mScrollingTextView: Button
    private lateinit var mIntentNav:Button
    private lateinit var mShoppingList:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onCreate")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mLayoutActivity = findViewById(R.id.button_layouts)
        mScrollingTextView = findViewById(R.id.button_scrollingtextview)
        mIntentNav = findViewById(R.id.button_intent_nav)
        mShoppingList = findViewById(R.id.button_shopping)


        mLayoutActivity.setOnClickListener {
            navLayoutActivity()
        }

        mScrollingTextView.setOnClickListener {
            navSTVActivity()
        }

        mIntentNav.setOnClickListener {
            navIntentNav()
        }
        mShoppingList.setOnClickListener {
            navShopping()
        }

    }

    private fun navShopping() {
        val intent = Intent(this,ShoppingList::class.java)
        startActivity(intent)
    }

    private fun navLayoutActivity(){
        val intent = Intent(this, Layout::class.java)
        startActivity(intent)
    }

    private fun navSTVActivity(){
        val intent = Intent(this, ScrollingTextView::class.java)
        startActivity(intent)
    }
    private fun navIntentNav(){
        val intent = Intent(this, IntentNav::class.java)
        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()

        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle","-----")
        Log.d("LifeCycle","onDestroy")
    }

}
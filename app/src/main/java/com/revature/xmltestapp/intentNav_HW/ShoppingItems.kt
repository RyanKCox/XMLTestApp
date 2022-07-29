package com.revature.xmltestapp.intentNav_HW

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.revature.xmltestapp.R

class ShoppingItems : AppCompatActivity() {
    private lateinit var mApples: Button
    private lateinit var mBread: Button
    private lateinit var mMilk: Button
    private lateinit var mCheese: Button
    private lateinit var mGarlic: Button
    private lateinit var mChicken: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_items)

        mApples = findViewById(R.id.button_shopping_apples)
        mBread = findViewById(R.id.button_shopping_bread)
        mMilk = findViewById(R.id.button_shopping_milk)
        mCheese = findViewById(R.id.button_shopping_cheese)
        mGarlic = findViewById(R.id.button_shopping_garlic)
        mChicken = findViewById(R.id.button_shopping_chicken)


        mApples.setOnClickListener { sendResult("Apples") }
        mBread.setOnClickListener { sendResult("Bread") }
        mMilk.setOnClickListener { sendResult("Milk") }
        mCheese.setOnClickListener { sendResult("Cheese") }
        mGarlic.setOnClickListener { sendResult("Garlic") }
        mChicken.setOnClickListener { sendResult("Chicken") }
    }

    private fun sendResult(item:String){
        val intent = Intent()
            .putExtra("ITEM",item)

        setResult(RESULT_OK,intent)
        finish()
    }
}
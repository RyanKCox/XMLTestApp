package com.revature.xmltestapp.intentNav_HW

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.revature.xmltestapp.R

class ShoppingList : AppCompatActivity() {
    private lateinit var mAddItem:Button
    private lateinit var mShoppingList:TextView
    private var count = 1

    private val getResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()){
        if(it.resultCode == RESULT_OK)
        {
            updateShoppingList(it.data?.getStringExtra("ITEM"))
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        mAddItem = findViewById(R.id.button_shopping_add)
        mShoppingList = findViewById(R.id.textView_shopping_list)

        savedInstanceState?.let {
            mShoppingList.visibility = View.VISIBLE
            mShoppingList.text = it.getString("ShoppingList")
            count = it.getInt("Count")
        }

        mAddItem.setOnClickListener {
            navShoppingItems()
        }

    }

    private fun updateShoppingList(stringExtra: String?) {
        stringExtra?.let {
            var str = mShoppingList.text.toString()
            str += "\n $count: $it"
            mShoppingList.text = str
            mShoppingList.visibility = View.VISIBLE
            count++
        }

    }
    private fun navShoppingItems() {
        val intent = Intent(this,ShoppingItems::class.java)
        getResult.launch(intent)

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("ShoppingList",mShoppingList.text.toString())
        outState.putInt("Count",count)
    }
}
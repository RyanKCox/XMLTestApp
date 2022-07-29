package com.revature.xmltestapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts


class IntentNav : AppCompatActivity() {

    companion object{
        val MESSAGE = "Message"
        val ARTICLE = "Article"
    }
    private lateinit var mSend:Button
    private lateinit var msgBox:TextView
    private lateinit var mArticle1:Button
    private lateinit var mArticle2:Button
    private lateinit var mArticle3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_nav)

        msgBox = findViewById(R.id.text_message1)
        mSend = findViewById(R.id.button_send)
        val text = findViewById<EditText>(R.id.eText_message)
        mArticle1 = findViewById(R.id.button_article1)
        mArticle2 = findViewById(R.id.button_article2)
        mArticle3 = findViewById(R.id.button_article3)

        val receivedMsg = intent.getStringExtra(MESSAGE)
        msgBox.text = receivedMsg


        mSend.setOnClickListener {
            sendMsg(text.text.toString())
        }
        mArticle1.setOnClickListener { sendArticle(getString( R.string.article_title)) }
        mArticle2.setOnClickListener { sendArticle(getString(R.string.article_subtitle)) }
        mArticle3.setOnClickListener { sendArticle(getString(R.string.article_text)) }

    }
    private val getResult =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            if(it.resultCode== Activity.RESULT_OK){
                msgBox.text = it.data?.getStringExtra(MESSAGE)
                msgBox.visibility = View.VISIBLE
            }
        }

    private fun sendMsg(msg:String){
        val intent = Intent(this,IntentNav2::class.java)
            .putExtra(MESSAGE,msg)
        getResult.launch(intent)
    }
    private fun sendArticle(article:String){
        val intent = Intent(this,IntentNav2::class.java)
            .putExtra(ARTICLE,article)
        getResult.launch(intent)
    }
}
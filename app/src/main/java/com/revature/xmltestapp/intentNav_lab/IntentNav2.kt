package com.revature.xmltestapp.intentNav_lab

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import com.revature.xmltestapp.R

class IntentNav2 : AppCompatActivity() {
    private lateinit var mReply:Button
    private lateinit var mTextView: TextView
    private lateinit var mArticleView:TextView
    private lateinit var mScrollView:ScrollView
    private lateinit var mHeader:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_nav2)

        mTextView = findViewById(R.id.text_message)
        mReply = findViewById(R.id.button_reply)
        mHeader = findViewById(R.id.text_header)
        mArticleView = findViewById(R.id.article_view)
        mScrollView = findViewById(R.id.article_scroll)

        //Intent
//        val receivedMsg = intent.getStringExtra(IntentNav.MESSAGE)
//        mTextView.text = receivedMsg
        intent.getStringExtra(IntentNav.MESSAGE)?.let {
            mTextView.text = it
            mTextView.visibility = View.VISIBLE
            mHeader.visibility = View.VISIBLE
        }
        intent.getStringExtra(IntentNav.ARTICLE)?.let {
            mArticleView.text = it
            mScrollView.visibility = View.VISIBLE
        }


        mReply.setOnClickListener {
            val sendMsg = findViewById<EditText>(R.id.text_reply)
            replyMsg(sendMsg.text.toString())
        }
    }

    private fun replyMsg(msg:String){
//        val intent = Intent(this,IntentNav::class.java)
//            .putExtra(IntentNav.MESSAGE,msg)
//        startActivity(intent)
        val intent = Intent()
        intent.putExtra(IntentNav.MESSAGE,msg)
        setResult(RESULT_OK,intent)
        finish()
    }
}
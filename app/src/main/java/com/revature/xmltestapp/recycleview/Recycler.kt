package com.revature.xmltestapp.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.revature.xmltestapp.R
import com.revature.xmltestapp.recycleview.adapter.ItemAdapter
import com.revature.xmltestapp.recycleview.data.Datasource

class Recycler : AppCompatActivity() {

    private lateinit var mRecyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        mRecyclerView = findViewById(R.id.recycler_view)

        val dataSet = Datasource().loadAffirmations()
        mRecyclerView.layoutManager = GridLayoutManager(this,2)
        mRecyclerView.adapter = ItemAdapter(this,dataSet)
        mRecyclerView.setHasFixedSize(true)

    }
}
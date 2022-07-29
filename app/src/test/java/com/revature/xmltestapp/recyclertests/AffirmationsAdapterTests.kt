package com.revature.xmltestapp.recyclertests

import android.content.Context
import com.revature.xmltestapp.recycleview.model.Affirmation
import org.junit.Test
import org.mockito.Mockito.mock
import com.revature.xmltestapp.R
import com.revature.xmltestapp.recycleview.adapter.ItemAdapter
import junit.framework.TestCase.assertEquals

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2,R.drawable.image2)
        )
        val adapter = ItemAdapter(context,data)

        assertEquals("ItemAdapter is not the correct size",data.size,adapter.itemCount)
    }
}
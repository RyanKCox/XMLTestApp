package com.revature.xmltestapp.recycleview.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes
    val strResID:Int,
    @DrawableRes
    val imgResID:Int
)

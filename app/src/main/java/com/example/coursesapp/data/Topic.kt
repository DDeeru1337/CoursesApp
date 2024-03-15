package com.example.coursesapp.data

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name : Int,
    val coursesCount : Int,
    @DrawableRes val icon : Int
)

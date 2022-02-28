package com.dicoding.picodiploma.loginwithanimation.utils

import android.view.View

fun List<View>.hideAlpha(){
    this.map { view ->
        view.alpha = 0f
    }
}
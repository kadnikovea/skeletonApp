package ru.k4dnikov.justapp.common.utils

import android.view.View

fun View.slideDown() = this.animate().translationY(this.height.toFloat())

fun View.slideUp() = this.animate().translationY(0f)
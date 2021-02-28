package ru.k4dnikov.justapp.common.base

import androidx.lifecycle.ViewModel

abstract class BaseViewModel<U> : ViewModel() {

    abstract fun processUiEvent(event: U)
}
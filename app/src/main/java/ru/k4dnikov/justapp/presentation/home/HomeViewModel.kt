package ru.k4dnikov.justapp.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.k4dnikov.justapp.common.base.BaseViewModel

class HomeViewModel : BaseViewModel<HomeUiEvent>() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    override fun processUiEvent(event: HomeUiEvent) {
    }
}
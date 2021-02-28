package ru.k4dnikov.justapp.presentation.more

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.k4dnikov.justapp.common.base.BaseViewModel

class MoreViewModel : BaseViewModel<MoreUiEvent>() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment. Нет, на самом деле это шторка. щас текста накидаю для объема. " +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема." +
                "Нет, на самом деле это шторка. щас текста накидаю для объема."
    }
    val text: LiveData<String> = _text

    override fun processUiEvent(event: MoreUiEvent) {
    }
}
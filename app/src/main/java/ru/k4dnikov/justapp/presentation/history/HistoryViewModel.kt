package ru.k4dnikov.justapp.presentation.history

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import ru.k4dnikov.justapp.common.base.BaseViewModel
import ru.k4dnikov.usecase.GetAllProceduresUseCase

class HistoryViewModel(private val getAllProceduresUseCase: GetAllProceduresUseCase) : BaseViewModel<HistoryUiEvent>() {

    private val _text = MutableLiveData<String>()

    val text: LiveData<String> = _text

    init {
        viewModelScope.launch(Dispatchers.Main) {
            val locations = withContext(Dispatchers.IO) { getAllProceduresUseCase() }
            _text.value = locations.joinToString(separator = ", ") { it.name }
        }
    }

    override fun processUiEvent(event: HistoryUiEvent) {

    }
}
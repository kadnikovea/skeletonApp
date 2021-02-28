package ru.k4dnikov.justapp.presentation.history

import org.kodein.di.Kodein
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import ru.k4dnikov.justapp.di.bindViewModel

val historyModule = Kodein.Module("historyModule") {

    bindViewModel<HistoryViewModel>() with singleton {
        HistoryViewModel(instance())
    }
}
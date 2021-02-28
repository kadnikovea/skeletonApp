package ru.k4dnikov.justapp.presentation.more

import org.kodein.di.Kodein
import org.kodein.di.generic.singleton
import ru.k4dnikov.justapp.di.bindViewModel

val moreModule = Kodein.Module("moreModule") {

    bindViewModel<MoreViewModel>() with singleton { MoreViewModel() }
}
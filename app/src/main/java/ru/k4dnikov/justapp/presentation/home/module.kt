package ru.k4dnikov.justapp.presentation.home

import org.kodein.di.Kodein
import org.kodein.di.generic.singleton
import ru.k4dnikov.justapp.di.bindViewModel

val homeModule = Kodein.Module("homeModule") {

    bindViewModel<HomeViewModel>() with singleton { HomeViewModel() }
}
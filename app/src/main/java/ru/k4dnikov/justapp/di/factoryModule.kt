package ru.k4dnikov.justapp.di

import androidx.lifecycle.ViewModelProvider
import org.kodein.di.Kodein
import org.kodein.di.direct
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

val viewModelFactoryModule = Kodein.Module("viewModelFactoryModule") {

    bind<ViewModelProvider.Factory>() with singleton { ViewModelFactory(kodein.direct) }
}
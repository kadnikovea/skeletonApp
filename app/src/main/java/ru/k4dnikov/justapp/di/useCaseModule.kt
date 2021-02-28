package ru.k4dnikov.justapp.di

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import ru.k4dnikov.usecase.GetAllProceduresUseCase

val useCaseModule = Kodein.Module("useCaseModule") {

    bind<GetAllProceduresUseCase>() with singleton { GetAllProceduresUseCase(instance()) }
}
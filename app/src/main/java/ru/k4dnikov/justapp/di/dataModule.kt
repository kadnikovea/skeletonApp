package ru.k4dnikov.justapp.di

import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import ru.k4dnikov.data.ProcedureRepositoryImpl
import ru.k4dnikov.data.datasources.local.ProcedureDatabaseStore
import ru.k4dnikov.domain.repository.ProcedureRepository
import ru.k4dnikov.justapp.framework.data.local.ProcedureDatabaseStoreImpl

val dataModule = Kodein.Module("dataModule") {

    bind<ProcedureDatabaseStore>() with singleton {
        ProcedureDatabaseStoreImpl(
            instance()
        )
    }

    bind<ProcedureRepository>() with singleton { ProcedureRepositoryImpl(instance()) }
}
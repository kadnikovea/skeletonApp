package ru.k4dnikov.data

import ru.k4dnikov.data.datasources.local.ProcedureDatabaseStore
import ru.k4dnikov.domain.model.Procedure
import ru.k4dnikov.domain.repository.ProcedureRepository

class ProcedureRepositoryImpl(private val databaseStore: ProcedureDatabaseStore):
    ProcedureRepository {

    override fun getAllProcedures(): List<Procedure> = databaseStore.getAllProcedures()
}
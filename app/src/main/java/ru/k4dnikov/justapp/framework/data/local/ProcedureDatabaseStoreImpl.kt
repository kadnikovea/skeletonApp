package ru.k4dnikov.justapp.framework.data.local

import ru.k4dnikov.data.datasources.local.ProcedureDatabaseStore
import ru.k4dnikov.domain.model.Procedure
import ru.k4dnikov.justapp.framework.data.local.database.AppDatabase
import ru.k4dnikov.justapp.framework.data.local.database.model.ProcedureEntity
import ru.k4dnikov.justapp.framework.data.local.database.toDomain

class ProcedureDatabaseStoreImpl(private val database: AppDatabase): ProcedureDatabaseStore {

    override fun getAllProcedures(): List<Procedure> = database.procedureDao().getAllProcedures()
//        listOf(
//            ProcedureEntity(0,"Ложка", 1200.00),
//            ProcedureEntity(1,"Вилка", 2000.00)
//        )
    .map(ProcedureEntity::toDomain)
}
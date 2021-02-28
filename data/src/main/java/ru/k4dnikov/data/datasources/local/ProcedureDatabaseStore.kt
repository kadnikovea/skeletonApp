package ru.k4dnikov.data.datasources.local

import ru.k4dnikov.domain.model.Procedure

interface ProcedureDatabaseStore {

    fun getAllProcedures(): List<Procedure>
}
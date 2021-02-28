package ru.k4dnikov.domain.repository

import ru.k4dnikov.domain.model.Procedure

interface ProcedureRepository {

    fun getAllProcedures(): List<Procedure>
}
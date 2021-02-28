package ru.k4dnikov.justapp.framework.data.local.database

import ru.k4dnikov.domain.model.Procedure
import ru.k4dnikov.justapp.framework.data.local.database.model.ProcedureEntity

fun Procedure.toEntity() = ProcedureEntity(
    id = id,
    name = name,
    price = price
)

fun ProcedureEntity.toDomain() = Procedure(
    id = id,
    name = name,
    price = price
)
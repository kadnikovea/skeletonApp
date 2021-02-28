package ru.k4dnikov.usecase

import ru.k4dnikov.domain.model.Procedure
import ru.k4dnikov.domain.repository.ProcedureRepository

class GetAllProceduresUseCase(private val procedureRepository: ProcedureRepository) {

    operator fun invoke(): List<Procedure> = procedureRepository.getAllProcedures()
}
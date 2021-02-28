package ru.k4dnikov.justapp.framework.data.local.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ru.k4dnikov.justapp.framework.data.local.database.model.ProcedureEntity

@Dao
interface ProcedureDao {
    @Query("SELECT * FROM procedure")
    fun getAllProcedures(): List<ProcedureEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllProcedures(kids: List<ProcedureEntity>)
}
package ru.k4dnikov.justapp.framework.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import ru.k4dnikov.justapp.framework.data.local.database.dao.ProcedureDao
import ru.k4dnikov.justapp.framework.data.local.database.model.ProcedureEntity

@Database(entities = [ProcedureEntity::class], version = DATABASE_VERSION, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun procedureDao(): ProcedureDao
}

private const val DATABASE_VERSION = 1
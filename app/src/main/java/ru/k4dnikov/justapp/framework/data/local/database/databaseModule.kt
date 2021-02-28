package ru.k4dnikov.justapp.framework.data.local.database

import android.content.Context
import androidx.room.Room
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.singleton

fun databaseModule(applicationContext: Context) = Kodein.Module("databaseModule") {

    bind<AppDatabase>() with singleton {
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "main"
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}
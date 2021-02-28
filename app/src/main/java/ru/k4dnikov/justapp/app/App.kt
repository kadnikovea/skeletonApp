package ru.k4dnikov.justapp.app

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import ru.k4dnikov.justapp.common.constantsModule
import ru.k4dnikov.justapp.framework.data.local.database.databaseModule

class App : Application(), KodeinAware {

    override val kodein: Kodein by Kodein.lazy {
        import(androidXModule(this@App))
        import(databaseModule(applicationContext))
        import(constantsModule)
    }
}
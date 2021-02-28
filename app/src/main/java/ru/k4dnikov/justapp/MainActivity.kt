package ru.k4dnikov.justapp

import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import org.kodein.di.Kodein
import org.kodein.di.android.closestKodein
import org.kodein.di.android.retainedKodein
import ru.k4dnikov.justapp.common.base.BaseActivity
import ru.k4dnikov.justapp.databinding.ActivityMainBinding
import ru.k4dnikov.justapp.di.dataModule
import ru.k4dnikov.justapp.di.useCaseModule
import ru.k4dnikov.justapp.di.viewModelFactoryModule
import ru.k4dnikov.justapp.presentation.history.historyModule
import ru.k4dnikov.justapp.presentation.home.homeModule
import ru.k4dnikov.justapp.presentation.more.moreModule

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val _parentKodein by closestKodein()

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun initWidgets() {
        val navView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.navigation_home, R.id.navigation_history, R.id.navigation_more_dialog))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun load() {
    }

    override val kodein: Kodein by retainedKodein {
        extend(_parentKodein)
        import(viewModelFactoryModule)
        import(dataModule)
        import(useCaseModule)
        import(historyModule)
        import(homeModule)
        import(moreModule)
    }
}
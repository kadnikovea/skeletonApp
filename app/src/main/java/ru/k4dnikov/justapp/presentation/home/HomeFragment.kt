package ru.k4dnikov.justapp.presentation.home

import android.view.LayoutInflater
import android.view.ViewGroup
import org.kodein.di.Kodein
import org.kodein.di.android.x.closestKodein
import ru.k4dnikov.justapp.common.base.BaseFragment
import ru.k4dnikov.justapp.databinding.FragmentHistoryBinding
import ru.k4dnikov.justapp.di.activityScopedFragmentViewModel
import ru.k4dnikov.justapp.common.utils.observe

class HomeFragment : BaseFragment<FragmentHistoryBinding>() {

    override val kodein: Kodein by closestKodein()

    override val viewModel: HomeViewModel by activityScopedFragmentViewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHistoryBinding
        get() = FragmentHistoryBinding::inflate

    override fun initWidgets() {
    }

    override fun load() {
        observe(viewModel.text) {
            binding.textHistory.text = it
        }
    }
}
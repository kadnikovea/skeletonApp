package ru.k4dnikov.justapp.presentation.more

import android.view.LayoutInflater
import android.view.ViewGroup
import org.kodein.di.Kodein
import org.kodein.di.android.x.closestKodein
import ru.k4dnikov.justapp.common.base.BaseBottomSheetDialogFragment
import ru.k4dnikov.justapp.databinding.FragmentDialogMoreBinding
import ru.k4dnikov.justapp.di.fragmentViewModel
import ru.k4dnikov.justapp.common.utils.observe

class MoreFragment : BaseBottomSheetDialogFragment<FragmentDialogMoreBinding>() {

    override val kodein: Kodein by closestKodein()

    override val viewModel: MoreViewModel by fragmentViewModel()

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentDialogMoreBinding
        get() = FragmentDialogMoreBinding::inflate

    override fun initWidgets() {
    }

    override fun load() {
        observe(viewModel.text) {
            binding.textMore.text = it
        }
    }
}
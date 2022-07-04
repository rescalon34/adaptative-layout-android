package com.escalondev.adaptativelayout.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.escalondev.adaptativelayout.BR
import com.escalondev.adaptativelayout.R
import com.escalondev.adaptativelayout.databinding.FragmentDetailBinding
import com.escalondev.adaptativelayout.ui.base.BaseFragment
import com.escalondev.adaptativelayout.ui.home.MainSharedViewModel
import com.escalondev.adaptativelayout.util.EventObserver

class DetailFragment : BaseFragment<FragmentDetailBinding>(
    R.layout.fragment_detail, BR.viewModel
) {

    override val viewModel: DetailViewModel by viewModels()
    private val mainSharedViewModel: MainSharedViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainSharedViewModel.detailSpaceItem.observe(viewLifecycleOwner, EventObserver {
            viewModel.setDetailItem(it)
        })
    }
}

package com.escalondev.adaptativelayout.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.escalondev.adaptativelayout.BR
import com.escalondev.adaptativelayout.R
import com.escalondev.adaptativelayout.databinding.FragmentHomeBinding
import com.escalondev.adaptativelayout.model.SpaceItem
import com.escalondev.adaptativelayout.ui.base.BaseFragment
import com.escalondev.adaptativelayout.util.CustomListOnBackPressedCallback
import com.escalondev.adaptativelayout.util.Event
import com.escalondev.adaptativelayout.util.OnItemClickListener

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    R.layout.fragment_home, BR.viewModel
) {

    override val viewModel: HomeViewModel by viewModels()
    private val mainSharedViewModel: MainSharedViewModel by activityViewModels()
    private lateinit var adapter: HomeAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registerCustomBackCallback()
        setupAdapter()
    }

    private fun registerCustomBackCallback() {
        requireActivity().onBackPressedDispatcher.addCallback(
            viewLifecycleOwner, CustomListOnBackPressedCallback(binding().slidingPaneLayout)
        )
    }

    private fun setupAdapter() {
        adapter = HomeAdapter(onSpaceItemClicked())
        adapter.submitList(viewModel.getSpaceItemList())
        binding().rvHome.adapter = adapter
    }

    private fun onSpaceItemClicked() = OnItemClickListener { item ->
        val spaceItem = item as SpaceItem
        mainSharedViewModel.detailSpaceItem.value = Event(spaceItem)
        binding().slidingPaneLayout.openPane()
    }
}

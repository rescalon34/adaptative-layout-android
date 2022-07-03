package com.escalondev.adaptativelayout.ui.home

import com.escalondev.adaptativelayout.BR
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.escalondev.adaptativelayout.R
import com.escalondev.adaptativelayout.databinding.FragmentHomeBinding
import com.escalondev.adaptativelayout.model.SpaceItem
import com.escalondev.adaptativelayout.ui.base.BaseFragment
import com.escalondev.adaptativelayout.util.OnItemClickListener

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    R.layout.fragment_home, BR.viewModel
) {

    override val viewModel: HomeViewModel by viewModels()
    private lateinit var adapter: HomeAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
    }

    private fun setupAdapter() {
        adapter = HomeAdapter(onSpaceItemClicked())
        adapter.submitList(viewModel.getSpaceItemList())
        binding().rvHome.adapter = adapter
    }

    private fun onSpaceItemClicked() = OnItemClickListener { item ->
        val spaceItem = item as SpaceItem
        Toast.makeText(requireContext(), "item: ${spaceItem.title}", Toast.LENGTH_SHORT).show()
    }
}

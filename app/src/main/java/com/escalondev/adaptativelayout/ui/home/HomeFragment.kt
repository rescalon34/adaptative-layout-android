package com.escalondev.adaptativelayout.ui.home

import com.escalondev.adaptativelayout.BR
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.escalondev.adaptativelayout.R
import com.escalondev.adaptativelayout.databinding.FragmentHomeBinding
import com.escalondev.adaptativelayout.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>(
    R.layout.fragment_home, BR.viewModel
) {

    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.test()
    }
}

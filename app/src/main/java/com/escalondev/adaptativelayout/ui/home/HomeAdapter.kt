package com.escalondev.adaptativelayout.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.escalondev.adaptativelayout.R
import com.escalondev.adaptativelayout.databinding.ItemSpaceImagesBinding
import com.escalondev.adaptativelayout.model.SpaceItem
import com.escalondev.adaptativelayout.util.OnItemClickListener

class HomeAdapter(private val onItemClickListener: OnItemClickListener) :
    ListAdapter<SpaceItem, HomeAdapter.SpaceViewHolder>(SPACE_DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpaceViewHolder {
        val binding = DataBindingUtil.inflate<ItemSpaceImagesBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_space_images, parent, false
        )
        return SpaceViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: SpaceViewHolder, position: Int) {
        viewHolder.bind(getItem(position), onItemClickListener)
    }

    inner class SpaceViewHolder(private var binding: ItemSpaceImagesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(spaceItem: SpaceItem, onItemClickListener: OnItemClickListener) {
            binding.spaceItem = spaceItem
            binding.onClickListener = onItemClickListener
        }
    }

    companion object {
        private val SPACE_DIFF_CALLBACK = object : DiffUtil.ItemCallback<SpaceItem>() {
            override fun areItemsTheSame(
                oldItem: SpaceItem,
                newItem: SpaceItem
            ): Boolean = oldItem == newItem

            override fun areContentsTheSame(
                oldItem: SpaceItem,
                newItem: SpaceItem
            ): Boolean = oldItem == newItem
        }
    }
}

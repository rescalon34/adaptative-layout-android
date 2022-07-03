package com.escalondev.adaptativelayout.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.escalondev.adaptativelayout.model.SpaceItem
import com.escalondev.adaptativelayout.ui.base.BaseViewModel

class DetailViewModel : BaseViewModel() {

    private val _detailSpaceItem = MutableLiveData<SpaceItem>()
    val detailSpaceItem: LiveData<SpaceItem> = _detailSpaceItem

    fun setDetailItem(spaceItem: SpaceItem) {
        _detailSpaceItem.value = spaceItem
    }
}

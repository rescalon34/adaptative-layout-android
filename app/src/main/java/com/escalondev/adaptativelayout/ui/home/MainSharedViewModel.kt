package com.escalondev.adaptativelayout.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.escalondev.adaptativelayout.model.SpaceItem
import com.escalondev.adaptativelayout.util.Event

class MainSharedViewModel : ViewModel() {

    var detailSpaceItem = MutableLiveData<Event<SpaceItem>>()
}

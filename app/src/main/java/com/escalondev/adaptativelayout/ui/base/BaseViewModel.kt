package com.escalondev.adaptativelayout.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.escalondev.adaptativelayout.util.Event
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    val isLoading = MutableLiveData<Boolean>()
    protected val messageLiveData = MutableLiveData<String?>()
    val messageEventLive: LiveData<String?> = messageLiveData

    val triggerClickEvent = MutableLiveData<Event<Int>>()
}

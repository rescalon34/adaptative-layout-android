package com.escalondev.adaptativelayout.util

/**
 * an OnItemClickListener class to send any parameters
 */
class OnItemClickListener(val onClickListener: (param: Any) -> Unit) {
    fun onItemClick(param: Any) = onClickListener(param)
}

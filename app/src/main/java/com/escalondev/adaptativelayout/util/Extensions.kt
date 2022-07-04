package com.escalondev.adaptativelayout.util

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(
    message: String,
    actionMessage: String? = null,
    action: (() -> Unit)? = null
) {
    Snackbar.make(
        this,
        message,
        Snackbar.LENGTH_LONG
    ).apply { action?.let { setAction(actionMessage) { action.invoke() } } }.show()
}

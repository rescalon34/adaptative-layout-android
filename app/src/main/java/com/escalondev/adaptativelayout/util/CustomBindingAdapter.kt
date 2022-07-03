package com.escalondev.adaptativelayout.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.model.GlideUrl
import com.escalondev.adaptativelayout.R

@BindingAdapter(value = ["imageUrl", "placeholder"], requireAll = false)
fun ImageView.loadImage(
    imageUrl: String,
    placeholder: String? = null
) {
    if (imageUrl.isNotEmpty()) {
        Glide.with(this.context)
            .load(GlideUrl(imageUrl))
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .placeholder(R.color.purple_500)
            .error(placeholder ?: R.color.black)
            .dontAnimate()
            .into(this)
    }
}

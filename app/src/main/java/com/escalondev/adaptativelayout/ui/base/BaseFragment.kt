package com.escalondev.adaptativelayout.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.escalondev.adaptativelayout.util.showSnackBar

/**
 * Abstract class to inflate fragment and set viewModel variable dynamically
 * @param layoutId the id of the view layout
 * @param viewModelId represents the variable name located on the layout xml file
 */
abstract class BaseFragment<T : ViewDataBinding>(
    @LayoutRes val layoutId: Int,
    private val viewModelId: Int
) : Fragment() {

    /**
     * ViewModel abstract val.
     * Must be overridden in the child classes.
     * e.g. override val viewModel: LoginViewModel by viewModels()
     *
     * Set to null if no ViewModel is needed.
     * e.g.
     * override val viewModel: ViewModel? = null
     */
    protected abstract val viewModel: ViewModel?

    private lateinit var viewDataBinding: T

    /**
     * use this binding() function on the fragment child
     */
    fun binding() = viewDataBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = onInflateView(inflater, container)

    /**
     * Inflate the binding fragment and set the viewModel variable
     * @param inflater layoutInflater
     * @param container vieGroupContainer
     */
    private fun onInflateView(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): View? {
        viewDataBinding = dataBindingInflate(inflater, container, layoutId)

        return viewDataBinding.apply {
            lifecycleOwner = viewLifecycleOwner
            viewModel?.let { setVariable(viewModelId, it) }
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (viewModel as? BaseViewModel)?.messageEventLive?.observe(viewLifecycleOwner) { message ->
            message?.let { showSnackBar(it) }
        }
    }

    open fun getClickActionEvent() = (viewModel as? BaseViewModel)?.triggerClickEvent

    /**
     * inflate layout and return a DataBinding instance
     */
    private fun <T : ViewDataBinding> dataBindingInflate(
        inflater: LayoutInflater,
        container: ViewGroup?,
        @LayoutRes layoutId: Int
    ) = DataBindingUtil.inflate(
        inflater,
        layoutId,
        container,
        false
    ) as T

    /**
     * as most of the child fragments will show a snackBar message, calling this function
     * avoids to pass a view every time
     * @param message simple message
     */
    fun showSnackBar(message: String) {
        viewDataBinding.root.showSnackBar(message)
    }

    open fun setupToolbar(toolbar: Toolbar) {
        (activity as AppCompatActivity?)?.setSupportActionBar(toolbar)
    }
}

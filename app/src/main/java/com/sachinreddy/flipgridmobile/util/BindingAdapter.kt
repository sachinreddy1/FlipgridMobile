package com.sachinreddy.flipgridmobile.util

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.databinding.BindingAdapter
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel

@BindingAdapter(
    value = ["android:vm", "android:viewId"],
    requireAll = true
)
fun bindTextWatcher(
    editText: EditText,
    vm: MainViewModel,
    viewId: Int
) {
    editText.addTextChangedListener(object: TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            vm.apply {
                when (viewId) {
                    0 -> firstName.postValue(p0.toString())
                    1 -> emailAddress.postValue(p0.toString())
                    2 -> password.postValue(p0.toString())
                    3 -> website.postValue(p0.toString())
                }
            }
        }

        override fun afterTextChanged(p0: Editable?) {
        }
    })
}
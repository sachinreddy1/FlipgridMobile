package com.sachinreddy.flipgridmobile.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var firstName = MutableLiveData("")
    var emailAddress = MutableLiveData("")
    var password = MutableLiveData("")
    var website = MutableLiveData("")

    fun checkAllField(): Boolean {
        return firstName.value!!.isBlank() || emailAddress.value!!.isBlank() || password.value!!.isBlank() || website.value!!.isBlank()
    }
}
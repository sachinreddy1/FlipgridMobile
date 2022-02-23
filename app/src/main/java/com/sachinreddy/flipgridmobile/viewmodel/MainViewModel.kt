package com.sachinreddy.flipgridmobile.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var firstName = MutableLiveData("")
    var emailAddress = MutableLiveData("")
    var password = MutableLiveData("")
    var website = MutableLiveData("")

    fun checkRequiredField(): Boolean {
        return emailAddress.value!!.isBlank() || password.value!!.isBlank()
    }
}
package com.sachinreddy.flipgridmobile.viewmodel

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainViewModelTest {
    val mainViewModel = MainViewModel()

    @Test
    fun falseIfEmailAndPassword() {
        // Given
        mainViewModel.emailAddress.postValue("frodo@bagend.com")
        mainViewModel.password.postValue("turnips")

        // when
        val result = mainViewModel.checkRequiredField()

        // then
        assert(!!result)
    }

    @Test
    fun falseIfEmailOrPasswordNotPresent() {
        // Given
        mainViewModel.emailAddress.postValue("frodo@bagend.com")
        mainViewModel.firstName.postValue("frodo")

        // when
        val result = mainViewModel.checkRequiredField()

        // then
        assert(result)
    }
}
package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sachinreddy.flipgridmobile.databinding.FragmentSubmitBinding
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel

class SubmitFragment: Fragment() {
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentSubmitBinding.inflate(inflater, container, false).apply {
            vm = mainViewModel
            return root
        }
    }
}
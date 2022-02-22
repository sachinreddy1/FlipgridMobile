package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.sachinreddy.flipgridmobile.databinding.FragmentSubmitBinding
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel

class SubmitFragment: Fragment() {

    private var _binding: FragmentSubmitBinding? = null
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        _binding = FragmentSubmitBinding.inflate(inflater, container, false)
        return _binding?.root
    }

}
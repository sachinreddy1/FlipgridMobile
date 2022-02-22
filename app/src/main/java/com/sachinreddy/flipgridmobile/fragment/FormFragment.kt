package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sachinreddy.flipgridmobile.databinding.FragmentFormBinding

class FormFragment: Fragment() {

    private var _binding: FragmentFormBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormBinding.inflate(inflater, container, false)
        return _binding?.root
    }

}
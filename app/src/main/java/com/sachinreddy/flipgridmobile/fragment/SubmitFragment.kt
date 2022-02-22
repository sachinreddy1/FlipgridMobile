package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sachinreddy.flipgridmobile.databinding.FragmentSubmitBinding

class SubmitFragment: Fragment() {

    private var _binding: FragmentSubmitBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSubmitBinding.inflate(inflater, container, false)
        return _binding?.root
    }

}
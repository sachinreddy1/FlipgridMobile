package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sachinreddy.flipgridmobile.databinding.FragmentSubmitBinding
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel

class SubmitFragment: Fragment() {
    private var binding: FragmentSubmitBinding? = null
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentSubmitBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@SubmitFragment
            vm = mainViewModel
            binding = this
            return root
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.buttonSignIn?.setOnClickListener {
            Toast.makeText(context, "Signing in...", Toast.LENGTH_SHORT).show()
        }

        super.onViewCreated(view, savedInstanceState)
    }
}
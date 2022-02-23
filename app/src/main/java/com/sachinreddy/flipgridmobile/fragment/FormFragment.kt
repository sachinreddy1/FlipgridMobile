package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sachinreddy.flipgridmobile.R
import com.sachinreddy.flipgridmobile.databinding.FragmentFormBinding
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel
class FormFragment : Fragment() {
    private var binding: FragmentFormBinding? = null
    private lateinit var navController: NavController
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        FragmentFormBinding.inflate(inflater, container, false).apply {
            lifecycleOwner = this@FormFragment
            vm = mainViewModel
            binding = this
            return root
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)
        binding?.buttonSubmit?.setOnClickListener {
            navigateNext()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun navigateNext() {
        if (mainViewModel.checkRequiredField()) {
            Toast.makeText(context, "Please fill all fields.", Toast.LENGTH_SHORT).show()
        } else {
            navController.navigate(R.id.action_fragmentForm_to_fragmentSubmit)
        }
    }
}


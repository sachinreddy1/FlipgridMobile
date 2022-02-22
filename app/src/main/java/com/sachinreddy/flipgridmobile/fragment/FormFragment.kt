package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sachinreddy.flipgridmobile.R
import com.sachinreddy.flipgridmobile.databinding.FragmentFormBinding
import com.sachinreddy.flipgridmobile.viewmodel.MainViewModel

class FormFragment : Fragment() {
    private var _binding: FragmentFormBinding? = null
    private lateinit var navController: NavController
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        _binding = FragmentFormBinding.inflate(inflater, container, false)

        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)

        _binding?.buttonSubmit?.setOnClickListener {
            mainViewModel.apply {
                if (firstName.isNullOrBlank() || emailAddress.isNullOrBlank() || password.isNullOrBlank() || website.isNullOrBlank()) {
                    Toast.makeText(context, "Please fill all fields.", Toast.LENGTH_SHORT).show()
                } else {
                    navController.navigate(R.id.action_fragmentForm_to_fragmentSubmit)
                }
            }
        }

        super.onViewCreated(view, savedInstanceState)
    }
}
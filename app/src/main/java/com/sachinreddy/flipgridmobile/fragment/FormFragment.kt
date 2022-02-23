package com.sachinreddy.flipgridmobile.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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
    private var _binding: FragmentFormBinding? = null
    private lateinit var navController: NavController
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFormBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)

        _binding?.buttonSubmit?.setOnClickListener {
            mainViewModel.apply {
                if (firstName.value!!.isBlank() || emailAddress.value!!.isBlank() || password.value!!.isBlank() || website.value!!.isBlank()) {
                    Toast.makeText(context, "Please fill all fields.", Toast.LENGTH_SHORT).show()
                } else {
                    navController.navigate(R.id.action_fragmentForm_to_fragmentSubmit)
                }
            }
        }

        _binding?.apply {
            firstName.addTextChangedListener(FormTextChangedListener(R.id.firstName))
            emailAddress.addTextChangedListener(FormTextChangedListener(R.id.emailAddress))
            password.addTextChangedListener(FormTextChangedListener(R.id.password))
            website.addTextChangedListener(FormTextChangedListener(R.id.website))
        }

        super.onViewCreated(view, savedInstanceState)
    }

    inner class FormTextChangedListener(val viewId: Int): TextWatcher {
        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            mainViewModel.apply {
                when (viewId) {
                    R.id.firstName -> firstName.postValue(p0.toString())
                    R.id.emailAddress -> emailAddress.postValue(p0.toString())
                    R.id.password -> password.postValue(p0.toString())
                    R.id.website -> website.postValue(p0.toString())
                }
            }
        }

        override fun afterTextChanged(p0: Editable?) {
        }
    }
}
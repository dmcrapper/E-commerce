package com.ibrahim.onboardingscreen.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    lateinit var  binding : FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater,container,false)

        binding.loginretailer.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment2_to_signUpFragment)
        }

        return binding.root
    }

}
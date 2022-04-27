package com.ibrahim.onboardingscreen.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentSecondBinding
import com.ibrahim.onboardingscreen.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater,container,false)

        binding.LtTheUserLogIne.setOnClickListener {
          findNavController().navigate(R.id.action_signUpFragment_to_venifyOTP2)
        }

        return binding.root
    }


}
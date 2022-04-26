package com.ibrahim.onboardingscreen.authentication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentSecondBinding
import com.ibrahim.onboardingscreen.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private val Mysing  =SignUpFragment()
lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater,container,false)

        return binding.root
    }


}
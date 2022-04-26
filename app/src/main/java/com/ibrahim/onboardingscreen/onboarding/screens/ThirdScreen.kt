package com.ibrahim.onboardingscreen.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
 lateinit var binding: FragmentThirdScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThirdScreenBinding.inflate(inflater,container,false)

        binding.finish.setOnClickListener {

            findNavController().navigate(R.id.action_viewPagerFragment_to_loginFragment2)
            onBoardingFinshed()
        }

        return binding.root
    }

    private fun onBoardingFinshed(){
      val sharedPref = requireActivity().getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

}
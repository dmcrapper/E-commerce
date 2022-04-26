package com.ibrahim.onboardingscreen.splashscreen

import android.content.Context
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

import androidx.navigation.fragment.findNavController
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentLoginBinding
import com.ibrahim.onboardingscreen.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    lateinit var  binding : FragmentSplashBinding
    lateinit var viewModel: splashModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewModel = ViewModelProvider(this).get(splashModel::class.java)
        viewModel.liveData.observe(this, Observer {
            when (it) {
                is SplashState.MainAcivity -> {

                    if (onBoardingFinshed()){
                        findNavController().navigate(R.id.action_splashFragment_to_loginFragment2)
                    }else{
                        findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)

                    }

                }
            }
        })

        binding =  FragmentSplashBinding.inflate(inflater, container, false)

        return binding.root
    }


    private fun onBoardingFinshed() :Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }

}
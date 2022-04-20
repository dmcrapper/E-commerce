package com.ibrahim.onboardingscreen.splashscreen

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.ibrahim.onboardingscreen.R

class SplashFragment : Fragment() {

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
                        findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
                    }else{
                        findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
                    }

                }
            }
        })

        return  return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    private fun onBoardingFinshed() :Boolean{
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }

}
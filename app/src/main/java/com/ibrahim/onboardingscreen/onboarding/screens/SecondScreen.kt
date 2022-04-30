package com.ibrahim.onboardingscreen.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentSecondBinding

class SecondScreen : Fragment() {
lateinit var  binding :FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)


       // fun bv(){
           binding.next2.setOnClickListener {
                binding.root.rootView.findViewById<ViewPager2>(R.id.viewPager).currentItem =2

            }
      //  }

        //bv()
        return binding.root
    }
}
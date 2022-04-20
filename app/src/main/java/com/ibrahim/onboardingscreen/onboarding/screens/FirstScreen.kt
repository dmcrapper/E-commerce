package com.ibrahim.onboardingscreen.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.ibrahim.onboardingscreen.R
import com.ibrahim.onboardingscreen.databinding.FragmentFirstBinding

class FirstScreen : Fragment() {
    lateinit var binding:FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)


        binding.next.setOnClickListener {
            binding.root.rootView.findViewById<ViewPager2>(R.id.viewPager).currentItem =1

        }
        return binding.root
    }


}
package com.ibrahim.onboardingscreen.onboarding.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ibrahim.onboardingscreen.databinding.FragmentViewPagerBinding
import com.ibrahim.onboardingscreen.onboarding.adapter.ViewPagerAdapter
import com.ibrahim.onboardingscreen.onboarding.screens.FirstScreen
import com.ibrahim.onboardingscreen.onboarding.screens.SecondScreen
import com.ibrahim.onboardingscreen.onboarding.screens.ThirdScreen



class ViewPagerFragment : Fragment() {
        lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentViewPagerBinding.inflate(inflater,container,false)

       val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            ThirdScreen()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root

    }
}
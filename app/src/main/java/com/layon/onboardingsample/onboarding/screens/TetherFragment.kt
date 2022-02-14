package com.layon.onboardingsample.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.layon.onboardingsample.R
import com.layon.onboardingsample.databinding.FragmentEthereumBinding
import com.layon.onboardingsample.databinding.FragmentTetherBinding


class TetherFragment : Fragment() {

    private var _binding: FragmentTetherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTetherBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.finishButton.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardingFinished()
        }

        return view
    }

    private fun onBoardingFinished() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }

}
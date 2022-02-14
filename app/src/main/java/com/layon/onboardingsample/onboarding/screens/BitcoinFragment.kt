package com.layon.onboardingsample.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.layon.onboardingsample.R
import com.layon.onboardingsample.databinding.FragmentBitcoinBinding
import com.layon.onboardingsample.databinding.FragmentViewPagerBinding


class BitcoinFragment : Fragment() {

    private var _binding: FragmentBitcoinBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentBitcoinBinding.inflate(inflater, container, false)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.nextButton.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }

}
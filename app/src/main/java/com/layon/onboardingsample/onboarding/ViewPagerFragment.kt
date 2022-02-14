package com.layon.onboardingsample.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.layon.onboardingsample.R
import com.layon.onboardingsample.databinding.FragmentViewPagerBinding
import com.layon.onboardingsample.onboarding.screens.BitcoinFragment
import com.layon.onboardingsample.onboarding.screens.EthereumFragment
import com.layon.onboardingsample.onboarding.screens.TetherFragment


class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding =  FragmentViewPagerBinding.inflate(inflater, container, false)
        val view = binding.root


        val fragmentList = arrayListOf<Fragment>(
            BitcoinFragment(),
            EthereumFragment(),
            TetherFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
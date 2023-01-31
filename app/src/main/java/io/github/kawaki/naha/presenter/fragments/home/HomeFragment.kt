package io.github.kawaki.naha.presenter.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.kawaki.naha.databinding.FragmentHomeBinding
import io.github.kawaki.naha.presenter.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

//    private val homeViewModel: HomeViewModel by viewModel()

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater, container, false)
    }

    override fun setUpFragment() {
        // TODO: Not yet implemented
    }

}
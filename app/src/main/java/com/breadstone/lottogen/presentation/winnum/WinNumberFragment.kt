package com.breadstone.lottogen.presentation.winnum

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.breadstone.core.BaseFragment
import com.breadstone.lottogen.R
import com.breadstone.lottogen.databinding.FragmentWinNumberBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WinNumberFragment :
    BaseFragment<FragmentWinNumberBinding, WinNumberViewModel>(R.layout.fragment_win_number) {

    override val viewModel: WinNumberViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
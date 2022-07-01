package com.breadstone.lottogen.presentation.numlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.breadstone.core.BaseFragment
import com.breadstone.lottogen.R
import com.breadstone.lottogen.databinding.FragmentNumListBinding

class NumListFragment :
    BaseFragment<FragmentNumListBinding, NumListViewModel>(R.layout.fragment_num_list) {
    override val viewModel: NumListViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
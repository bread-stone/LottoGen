package com.breadstone.lottogen.presentation.store

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.breadstone.core.BaseFragment
import com.breadstone.lottogen.R
import com.breadstone.lottogen.databinding.FragmentStoreBinding

class StoreFragment : BaseFragment<FragmentStoreBinding, StoreViewModel>(R.layout.fragment_store) {

    override val viewModel: StoreViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}
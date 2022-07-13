package com.breadstone.lottogen.presentation

import android.os.Bundle
import androidx.activity.viewModels
import com.breadstone.core.BaseActivity
import com.breadstone.lottogen.R
import com.breadstone.lottogen.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {
    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this


    }


}
package com.breadstone.lottogen.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.breadstone.core.BaseActivity
import com.breadstone.lottogen.R
import com.breadstone.lottogen.databinding.ActivityMainBinding
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {
    override val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdMob()

        initNavigation()
    }

    private fun initAdMob() {
        MobileAds.initialize(this) {

        }
        AdRequest.Builder().build().run {
            binding.adView.loadAd(this)
        }
    }

    private fun initNavigation() {
        val hostFragment =
            supportFragmentManager.findFragmentById(R.id.host_fragment) as NavHostFragment
        binding.mainBottomNav.setupWithNavController(hostFragment.navController)
    }
}
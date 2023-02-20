package com.hotelbooking.app.modules.welcomescreen.ui

import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityWelcomeScreenBinding
import com.hotelbooking.app.modules.welcomescreen.`data`.viewmodel.WelcomeScreenVM
import kotlin.String
import kotlin.Unit

class WelcomeScreenActivity :
    BaseActivity<ActivityWelcomeScreenBinding>(R.layout.activity_welcome_screen) {
  private val viewModel: WelcomeScreenVM by viewModels<WelcomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOME_SCREEN_ACTIVITY"

  }
}

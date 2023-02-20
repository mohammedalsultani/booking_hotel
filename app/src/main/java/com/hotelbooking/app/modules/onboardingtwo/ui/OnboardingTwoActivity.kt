package com.hotelbooking.app.modules.onboardingtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityOnboardingTwoBinding
import com.hotelbooking.app.modules.letsyouin.ui.LetSYouInActivity
import com.hotelbooking.app.modules.onboardingthree.ui.OnboardingThreeActivity
import com.hotelbooking.app.modules.onboardingtwo.`data`.model.ImageSliderSliderfindthebesthotelsModel
import com.hotelbooking.app.modules.onboardingtwo.`data`.viewmodel.OnboardingTwoVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingTwoActivity :
    BaseActivity<ActivityOnboardingTwoBinding>(R.layout.activity_onboarding_two) {
  private val imageSliderSliderfindthebesthotelsItems:
      ArrayList<ImageSliderSliderfindthebesthotelsModel> = arrayListOf()


  private val viewModel: OnboardingTwoVM by viewModels<OnboardingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderfindthebesthotelsAdapter =
    SliderfindthebesthotelsAdapter(imageSliderSliderfindthebesthotelsItems,true)
    binding.imageSliderSliderfindthebesthotels.adapter = sliderfindthebesthotelsAdapter
    binding.imageSliderSliderfindthebesthotels.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorMenu.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorMenu.updateIndicatorCounts(binding.imageSliderSliderfindthebesthotels.indicatorCount)
    binding.onboardingTwoVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderfindthebesthotels.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderfindthebesthotels.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = OnboardingThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSkip.setOnClickListener {
      val destIntent = LetSYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

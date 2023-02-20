package com.hotelbooking.app.modules.onboardingone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityOnboardingOneBinding
import com.hotelbooking.app.modules.letsyouin.ui.LetSYouInActivity
import com.hotelbooking.app.modules.onboardingone.`data`.model.ImageSliderSlidertravelsafelycomfortablyModel
import com.hotelbooking.app.modules.onboardingone.`data`.viewmodel.OnboardingOneVM
import com.hotelbooking.app.modules.onboardingtwo.ui.OnboardingTwoActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingOneActivity :
    BaseActivity<ActivityOnboardingOneBinding>(R.layout.activity_onboarding_one) {
  private val imageSliderSlidertravelsafelycomfortablyItems:
      ArrayList<ImageSliderSlidertravelsafelycomfortablyModel> = arrayListOf()


  private val viewModel: OnboardingOneVM by viewModels<OnboardingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidertravelsafelycomfortablyAdapter =
    SlidertravelsafelycomfortablyAdapter(imageSliderSlidertravelsafelycomfortablyItems,true)
    binding.imageSliderSlidertravelsafelycomfortably.adapter =
    slidertravelsafelycomfortablyAdapter
    binding.imageSliderSlidertravelsafelycomfortably.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorMenu.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorMenu.updateIndicatorCounts(binding.imageSliderSlidertravelsafelycomfortably.indicatorCount)
    binding.onboardingOneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidertravelsafelycomfortably.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidertravelsafelycomfortably.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.btnSkip.setOnClickListener {
      val destIntent = LetSYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = OnboardingTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

package com.hotelbooking.app.modules.onboardingthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityOnboardingThreeBinding
import com.hotelbooking.app.modules.letsyouin.ui.LetSYouInActivity
import com.hotelbooking.app.modules.onboardingthree.`data`.model.ImageSliderSlidernameModel
import com.hotelbooking.app.modules.onboardingthree.`data`.viewmodel.OnboardingThreeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class OnboardingThreeActivity :
    BaseActivity<ActivityOnboardingThreeBinding>(R.layout.activity_onboarding_three) {
  private val imageSliderSlidernameItems: ArrayList<ImageSliderSlidernameModel> = arrayListOf()


  private val viewModel: OnboardingThreeVM by viewModels<OnboardingThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidernameAdapter = SlidernameAdapter(imageSliderSlidernameItems,true)
    binding.imageSliderSlidername.adapter = slidernameAdapter
    binding.imageSliderSlidername.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorVideocamera.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorVideocamera.updateIndicatorCounts(binding.imageSliderSlidername.indicatorCount)
    binding.onboardingThreeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidername.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidername.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.btnSkip.setOnClickListener {
      val destIntent = LetSYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnNext.setOnClickListener {
      val destIntent = LetSYouInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ONBOARDING_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

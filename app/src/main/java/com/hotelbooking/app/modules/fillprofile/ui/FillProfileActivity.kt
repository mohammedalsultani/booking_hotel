package com.hotelbooking.app.modules.fillprofile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityFillProfileBinding
import com.hotelbooking.app.modules.fillprofile.`data`.viewmodel.FillProfileVM
import com.hotelbooking.app.modules.homescreencontainer.ui.HomeScreenContainerActivity
import kotlin.String
import kotlin.Unit

class FillProfileActivity : BaseActivity<ActivityFillProfileBinding>(R.layout.activity_fill_profile)
    {
  private val viewModel: FillProfileVM by viewModels<FillProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fillProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = HomeScreenContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FILL_PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FillProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

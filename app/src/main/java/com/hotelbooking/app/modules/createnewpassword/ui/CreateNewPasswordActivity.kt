package com.hotelbooking.app.modules.createnewpassword.ui

import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityCreateNewPasswordBinding
import com.hotelbooking.app.modules.createnewpassword.`data`.viewmodel.CreateNewPasswordVM
import com.hotelbooking.app.modules.resetpasswordsuccessful.ui.ResetPasswordSuccessfulDialog
import kotlin.String
import kotlin.Unit

class CreateNewPasswordActivity :
    BaseActivity<ActivityCreateNewPasswordBinding>(R.layout.activity_create_new_password) {
  private val viewModel: CreateNewPasswordVM by viewModels<CreateNewPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createNewPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnContinue.setOnClickListener {
      val destFragment = ResetPasswordSuccessfulDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, ResetPasswordSuccessfulDialog.TAG)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_PASSWORD_ACTIVITY"

  }
}

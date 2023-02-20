package com.hotelbooking.app.modules.logout.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.hotelbooking.app.databinding.BottomsheetLogoutBinding
import com.hotelbooking.app.modules.logout.`data`.viewmodel.LogoutVM
import kotlin.String
import kotlin.Unit

class LogoutBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetLogoutBinding>(R.layout.bottomsheet_logout) {
  private val viewModel: LogoutVM by viewModels<LogoutVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.logoutVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGOUT_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): LogoutBottomsheet {
      val fragment = LogoutBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}

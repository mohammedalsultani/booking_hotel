package com.hotelbooking.app.modules.cancelationsuccessful.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseDialogFragment
import com.hotelbooking.app.databinding.DialogCancelationSuccessfulBinding
import com.hotelbooking.app.modules.cancelationsuccessful.`data`.viewmodel.CancelationSuccessfulVM
import kotlin.String
import kotlin.Unit

class CancelationSuccessfulDialog :
    BaseDialogFragment<DialogCancelationSuccessfulBinding>(R.layout.dialog_cancelation_successful) {
  private val viewModel: CancelationSuccessfulVM by viewModels<CancelationSuccessfulVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.cancelationSuccessfulVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CANCELATION_SUCCESSFUL_DIALOG"


    fun getInstance(bundle: Bundle?): CancelationSuccessfulDialog {
      val fragment = CancelationSuccessfulDialog()
      fragment.arguments = bundle
      return fragment
    }
  }
}

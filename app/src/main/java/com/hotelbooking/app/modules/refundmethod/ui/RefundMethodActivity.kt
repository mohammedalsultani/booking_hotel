package com.hotelbooking.app.modules.refundmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityRefundMethodBinding
import com.hotelbooking.app.modules.cancelationsuccessful.ui.CancelationSuccessfulDialog
import com.hotelbooking.app.modules.refundmethod.`data`.model.RefundmethodRowModel
import com.hotelbooking.app.modules.refundmethod.`data`.viewmodel.RefundMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RefundMethodActivity :
    BaseActivity<ActivityRefundMethodBinding>(R.layout.activity_refund_method) {
  private val viewModel: RefundMethodVM by viewModels<RefundMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val refundmethodAdapter =
    RefundmethodAdapter(viewModel.refundmethodList.value?:mutableListOf())
    binding.recyclerRefundmethod.adapter = refundmethodAdapter
    refundmethodAdapter.setOnItemClickListener(
    object : RefundmethodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RefundmethodRowModel) {
        onClickRecyclerRefundmethod(view, position, item)
      }
    }
    )
    viewModel.refundmethodList.observe(this) {
      refundmethodAdapter.updateData(it)
    }
    binding.refundMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirmcancellation.setOnClickListener {
      val destFragment = CancelationSuccessfulDialog.getInstance(null)
      destFragment.show(this.supportFragmentManager, CancelationSuccessfulDialog.TAG)
    }
  }

  fun onClickRecyclerRefundmethod(
    view: View,
    position: Int,
    item: RefundmethodRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REFUND_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RefundMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

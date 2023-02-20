package com.hotelbooking.app.modules.choosepaymentmethod.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityChoosePaymentMethodBinding
import com.hotelbooking.app.modules.addnewcard.ui.AddNewCardActivity
import com.hotelbooking.app.modules.choosepaymentmethod.`data`.model.ListgoogleRowModel
import com.hotelbooking.app.modules.choosepaymentmethod.`data`.viewmodel.ChoosePaymentMethodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChoosePaymentMethodActivity :
    BaseActivity<ActivityChoosePaymentMethodBinding>(R.layout.activity_choose_payment_method) {
  private val viewModel: ChoosePaymentMethodVM by viewModels<ChoosePaymentMethodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgoogleAdapter = ListgoogleAdapter(viewModel.listgoogleList.value?:mutableListOf())
    binding.recyclerListgoogle.adapter = listgoogleAdapter
    listgoogleAdapter.setOnItemClickListener(
    object : ListgoogleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgoogleRowModel) {
        onClickRecyclerListgoogle(view, position, item)
      }
    }
    )
    viewModel.listgoogleList.observe(this) {
      listgoogleAdapter.updateData(it)
    }
    binding.choosePaymentMethodVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtAddNewCard.setOnClickListener {
      val destIntent = AddNewCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = AddNewCardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListgoogle(
    view: View,
    position: Int,
    item: ListgoogleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHOOSE_PAYMENT_METHOD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChoosePaymentMethodActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

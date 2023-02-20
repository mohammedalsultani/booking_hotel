package com.hotelbooking.app.modules.cardadded.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityCardAddedBinding
import com.hotelbooking.app.modules.cardadded.`data`.model.CardaddedRowModel
import com.hotelbooking.app.modules.cardadded.`data`.viewmodel.CardAddedVM
import com.hotelbooking.app.modules.confirmpayment.ui.ConfirmPaymentActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CardAddedActivity : BaseActivity<ActivityCardAddedBinding>(R.layout.activity_card_added) {
  private val viewModel: CardAddedVM by viewModels<CardAddedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cardaddedAdapter = CardaddedAdapter(viewModel.cardaddedList.value?:mutableListOf())
    binding.recyclerCardadded.adapter = cardaddedAdapter
    cardaddedAdapter.setOnItemClickListener(
    object : CardaddedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardaddedRowModel) {
        onClickRecyclerCardadded(view, position, item)
      }
    }
    )
    viewModel.cardaddedList.observe(this) {
      cardaddedAdapter.updateData(it)
    }
    binding.cardAddedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnContinue.setOnClickListener {
      val destIntent = ConfirmPaymentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerCardadded(
    view: View,
    position: Int,
    item: CardaddedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CARD_ADDED_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CardAddedActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

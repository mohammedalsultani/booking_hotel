package com.hotelbooking.app.modules.addnewcard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityAddNewCardBinding
import com.hotelbooking.app.modules.addnewcard.`data`.viewmodel.AddNewCardVM
import com.hotelbooking.app.modules.cardadded.ui.CardAddedActivity
import kotlin.String
import kotlin.Unit

class AddNewCardActivity : BaseActivity<ActivityAddNewCardBinding>(R.layout.activity_add_new_card) {
  private val viewModel: AddNewCardVM by viewModels<AddNewCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addNewCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnAddnewcardOne.setOnClickListener {
      val destIntent = CardAddedActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADD_NEW_CARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AddNewCardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

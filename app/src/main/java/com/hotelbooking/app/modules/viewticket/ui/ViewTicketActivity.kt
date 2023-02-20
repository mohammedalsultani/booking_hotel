package com.hotelbooking.app.modules.viewticket.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityViewTicketBinding
import com.hotelbooking.app.modules.viewticket.`data`.model.ViewticketRowModel
import com.hotelbooking.app.modules.viewticket.`data`.viewmodel.ViewTicketVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ViewTicketActivity : BaseActivity<ActivityViewTicketBinding>(R.layout.activity_view_ticket) {
  private val viewModel: ViewTicketVM by viewModels<ViewTicketVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val viewticketAdapter = ViewticketAdapter(viewModel.viewticketList.value?:mutableListOf())
    binding.recyclerViewticket.adapter = viewticketAdapter
    viewticketAdapter.setOnItemClickListener(
    object : ViewticketAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ViewticketRowModel) {
        onClickRecyclerViewticket(view, position, item)
      }
    }
    )
    viewModel.viewticketList.observe(this) {
      viewticketAdapter.updateData(it)
    }
    binding.viewTicketVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerViewticket(
    view: View,
    position: Int,
    item: ViewticketRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "VIEW_TICKET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewTicketActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

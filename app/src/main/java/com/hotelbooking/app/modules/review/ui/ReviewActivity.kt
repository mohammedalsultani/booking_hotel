package com.hotelbooking.app.modules.review.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityReviewBinding
import com.hotelbooking.app.modules.review.`data`.model.ListellipseoneRowModel
import com.hotelbooking.app.modules.review.`data`.model.ListstarRowModel
import com.hotelbooking.app.modules.review.`data`.viewmodel.ReviewVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ReviewActivity : BaseActivity<ActivityReviewBinding>(R.layout.activity_review) {
  private val viewModel: ReviewVM by viewModels<ReviewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val liststarAdapter = ListstarAdapter(viewModel.liststarList.value?:mutableListOf())
    binding.recyclerListstar.adapter = liststarAdapter
    liststarAdapter.setOnItemClickListener(
    object : ListstarAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListstarRowModel) {
        onClickRecyclerListstar(view, position, item)
      }
    }
    )
    viewModel.liststarList.observe(this) {
      liststarAdapter.updateData(it)
    }
    val listellipseoneAdapter =
    ListellipseoneAdapter(viewModel.listellipseoneList.value?:mutableListOf())
    binding.recyclerListellipseone.adapter = listellipseoneAdapter
    listellipseoneAdapter.setOnItemClickListener(
    object : ListellipseoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseoneRowModel) {
        onClickRecyclerListellipseone(view, position, item)
      }
    }
    )
    viewModel.listellipseoneList.observe(this) {
      listellipseoneAdapter.updateData(it)
    }
    binding.reviewVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListstar(
    view: View,
    position: Int,
    item: ListstarRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipseone(
    view: View,
    position: Int,
    item: ListellipseoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "REVIEW_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ReviewActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

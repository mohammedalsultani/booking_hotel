package com.hotelbooking.app.modules.searchfilter.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivitySearchFilterBinding
import com.hotelbooking.app.modules.filterresult.ui.FilterResultActivity
import com.hotelbooking.app.modules.searchfilter.`data`.model.Listrectanglefour3RowModel
import com.hotelbooking.app.modules.searchfilter.`data`.model.Listsizemediumtypefilled2RowModel
import com.hotelbooking.app.modules.searchfilter.`data`.viewmodel.SearchFilterVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchFilterActivity :
    BaseActivity<ActivitySearchFilterBinding>(R.layout.activity_search_filter) {
  private val viewModel: SearchFilterVM by viewModels<SearchFilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour3RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(this) {
      listrectanglefourAdapter.updateData(it)
    }
    val listsizemediumtypefilledAdapter =
    ListsizemediumtypefilledAdapter(viewModel.listsizemediumtypefilledList.value?:mutableListOf())
    binding.recyclerListsizemediumtypefilled.adapter = listsizemediumtypefilledAdapter
    listsizemediumtypefilledAdapter.setOnItemClickListener(
    object : ListsizemediumtypefilledAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listsizemediumtypefilled2RowModel) {
        onClickRecyclerListsizemediumtypefilled(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefilledList.observe(this) {
      listsizemediumtypefilledAdapter.updateData(it)
    }
    binding.searchFilterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnApplyfilter.setOnClickListener {
      val destIntent = FilterResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListsizemediumtypefilled(
    view: View,
    position: Int,
    item: Listsizemediumtypefilled2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_FILTER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchFilterActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

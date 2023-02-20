package com.hotelbooking.app.modules.filterresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityFilterResultBinding
import com.hotelbooking.app.modules.filterresult.`data`.model.Listrectanglefour4RowModel
import com.hotelbooking.app.modules.filterresult.`data`.model.Listsizemediumtypefilled3RowModel
import com.hotelbooking.app.modules.filterresult.`data`.viewmodel.FilterResultVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FilterResultActivity :
    BaseActivity<ActivityFilterResultBinding>(R.layout.activity_filter_result) {
  private val viewModel: FilterResultVM by viewModels<FilterResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsizemediumtypefilledAdapter =
    ListsizemediumtypefilledAdapter(viewModel.listsizemediumtypefilledList.value?:mutableListOf())
    binding.recyclerListsizemediumtypefilled.adapter = listsizemediumtypefilledAdapter
    listsizemediumtypefilledAdapter.setOnItemClickListener(
    object : ListsizemediumtypefilledAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listsizemediumtypefilled3RowModel) {
        onClickRecyclerListsizemediumtypefilled(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefilledList.observe(this) {
      listsizemediumtypefilledAdapter.updateData(it)
    }
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour4RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(this) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.filterResultVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsizemediumtypefilled(
    view: View,
    position: Int,
    item: Listsizemediumtypefilled3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour4RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "FILTER_RESULT_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FilterResultActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

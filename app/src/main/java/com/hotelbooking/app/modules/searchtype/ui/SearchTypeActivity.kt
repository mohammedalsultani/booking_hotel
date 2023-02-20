package com.hotelbooking.app.modules.searchtype.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivitySearchTypeBinding
import com.hotelbooking.app.modules.searchfilter.ui.SearchFilterActivity
import com.hotelbooking.app.modules.searchtype.`data`.model.Listsizemediumtypefilled1RowModel
import com.hotelbooking.app.modules.searchtype.`data`.viewmodel.SearchTypeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchTypeActivity : BaseActivity<ActivitySearchTypeBinding>(R.layout.activity_search_type) {
  private val viewModel: SearchTypeVM by viewModels<SearchTypeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsizemediumtypefilledAdapter =
    ListsizemediumtypefilledAdapter(viewModel.listsizemediumtypefilledList.value?:mutableListOf())
    binding.recyclerListsizemediumtypefilled.adapter = listsizemediumtypefilledAdapter
    listsizemediumtypefilledAdapter.setOnItemClickListener(
    object : ListsizemediumtypefilledAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listsizemediumtypefilled1RowModel) {
        onClickRecyclerListsizemediumtypefilled(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefilledList.observe(this) {
      listsizemediumtypefilledAdapter.updateData(it)
    }
    binding.searchTypeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearchBar.setOnClickListener {
      val destIntent = SearchFilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListsizemediumtypefilled(
    view: View,
    position: Int,
    item: Listsizemediumtypefilled1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_TYPE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchTypeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

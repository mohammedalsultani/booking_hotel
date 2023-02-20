package com.hotelbooking.app.modules.searchpage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseFragment
import com.hotelbooking.app.databinding.FragmentSearchPageBinding
import com.hotelbooking.app.modules.searchpage.`data`.model.Listrectanglefour1RowModel
import com.hotelbooking.app.modules.searchpage.`data`.model.ListsizemediumtypefilledRowModel
import com.hotelbooking.app.modules.searchpage.`data`.viewmodel.SearchPageVM
import com.hotelbooking.app.modules.searchtype.ui.SearchTypeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchPageFragment : BaseFragment<FragmentSearchPageBinding>(R.layout.fragment_search_page) {
  private val viewModel: SearchPageVM by viewModels<SearchPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsizemediumtypefilledAdapter =
    ListsizemediumtypefilledAdapter(viewModel.listsizemediumtypefilledList.value?:mutableListOf())
    binding.recyclerListsizemediumtypefilled.adapter = listsizemediumtypefilledAdapter
    listsizemediumtypefilledAdapter.setOnItemClickListener(
    object : ListsizemediumtypefilledAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListsizemediumtypefilledRowModel) {
        onClickRecyclerListsizemediumtypefilled(view, position, item)
      }
    }
    )
    viewModel.listsizemediumtypefilledList.observe(requireActivity()) {
      listsizemediumtypefilledAdapter.updateData(it)
    }
    val listrectanglefourAdapter =
    ListrectanglefourAdapter(viewModel.listrectanglefourList.value?:mutableListOf())
    binding.recyclerListrectanglefour.adapter = listrectanglefourAdapter
    listrectanglefourAdapter.setOnItemClickListener(
    object : ListrectanglefourAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listrectanglefour1RowModel) {
        onClickRecyclerListrectanglefour(view, position, item)
      }
    }
    )
    viewModel.listrectanglefourList.observe(requireActivity()) {
      listrectanglefourAdapter.updateData(it)
    }
    binding.searchPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.searchViewSearchBar.setOnClickListener {
      val destIntent = SearchTypeActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListsizemediumtypefilled(
    view: View,
    position: Int,
    item: ListsizemediumtypefilledRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListrectanglefour(
    view: View,
    position: Int,
    item: Listrectanglefour1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): SearchPageFragment {
      val fragment = SearchPageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}

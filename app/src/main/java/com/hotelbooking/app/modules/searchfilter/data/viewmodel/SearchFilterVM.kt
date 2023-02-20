package com.hotelbooking.app.modules.searchfilter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.searchfilter.`data`.model.Listrectanglefour3RowModel
import com.hotelbooking.app.modules.searchfilter.`data`.model.Listsizemediumtypefilled2RowModel
import com.hotelbooking.app.modules.searchfilter.`data`.model.SearchFilterModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchFilterVM : ViewModel(), KoinComponent {
  val searchFilterModel: MutableLiveData<SearchFilterModel> = MutableLiveData(SearchFilterModel())

  var navArguments: Bundle? = null

  val listrectanglefourList: MutableLiveData<MutableList<Listrectanglefour3RowModel>> =
      MutableLiveData(mutableListOf())

  val listsizemediumtypefilledList: MutableLiveData<MutableList<Listsizemediumtypefilled2RowModel>>
      = MutableLiveData(mutableListOf())
}

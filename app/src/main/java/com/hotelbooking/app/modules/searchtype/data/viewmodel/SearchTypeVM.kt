package com.hotelbooking.app.modules.searchtype.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.searchtype.`data`.model.Listsizemediumtypefilled1RowModel
import com.hotelbooking.app.modules.searchtype.`data`.model.SearchTypeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchTypeVM : ViewModel(), KoinComponent {
  val searchTypeModel: MutableLiveData<SearchTypeModel> = MutableLiveData(SearchTypeModel())

  var navArguments: Bundle? = null

  val listsizemediumtypefilledList: MutableLiveData<MutableList<Listsizemediumtypefilled1RowModel>>
      = MutableLiveData(mutableListOf())
}

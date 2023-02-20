package com.hotelbooking.app.modules.filterresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.filterresult.`data`.model.FilterResultModel
import com.hotelbooking.app.modules.filterresult.`data`.model.Listrectanglefour4RowModel
import com.hotelbooking.app.modules.filterresult.`data`.model.Listsizemediumtypefilled3RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FilterResultVM : ViewModel(), KoinComponent {
  val filterResultModel: MutableLiveData<FilterResultModel> = MutableLiveData(FilterResultModel())

  var navArguments: Bundle? = null

  val listsizemediumtypefilledList: MutableLiveData<MutableList<Listsizemediumtypefilled3RowModel>>
      = MutableLiveData(mutableListOf())

  val listrectanglefourList: MutableLiveData<MutableList<Listrectanglefour4RowModel>> =
      MutableLiveData(mutableListOf())
}

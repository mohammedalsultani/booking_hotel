package com.hotelbooking.app.modules.hoteldetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.hoteldetails.`data`.model.HotelDetailsModel
import com.hotelbooking.app.modules.hoteldetails.`data`.model.HoteldetailsRowModel
import com.hotelbooking.app.modules.hoteldetails.`data`.model.SpinnerTypeButtonTypeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HotelDetailsVM : ViewModel(), KoinComponent {
  val hotelDetailsModel: MutableLiveData<HotelDetailsModel> = MutableLiveData(HotelDetailsModel())

  var navArguments: Bundle? = null

  val spinnerTypeButtonTypeList: MutableLiveData<MutableList<SpinnerTypeButtonTypeModel>> =
      MutableLiveData()

  val hoteldetailsList: MutableLiveData<MutableList<HoteldetailsRowModel>> =
      MutableLiveData(mutableListOf())
}

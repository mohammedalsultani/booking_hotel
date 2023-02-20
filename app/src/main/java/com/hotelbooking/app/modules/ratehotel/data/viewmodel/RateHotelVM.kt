package com.hotelbooking.app.modules.ratehotel.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.ratehotel.`data`.model.RateHotelModel
import org.koin.core.KoinComponent

class RateHotelVM : ViewModel(), KoinComponent {
  val rateHotelModel: MutableLiveData<RateHotelModel> = MutableLiveData(RateHotelModel())

  var navArguments: Bundle? = null
}

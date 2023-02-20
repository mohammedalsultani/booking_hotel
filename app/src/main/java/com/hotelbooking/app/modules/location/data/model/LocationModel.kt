package com.hotelbooking.app.modules.location.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class LocationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHotelLocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_hotel_location)

)

package com.hotelbooking.app.modules.bookingongoingtabcontainer.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookingOngoingTabContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyBookings: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookings)

)

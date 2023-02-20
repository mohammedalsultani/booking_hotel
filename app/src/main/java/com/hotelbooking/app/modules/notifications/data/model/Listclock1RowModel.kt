package com.hotelbooking.app.modules.notifications.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class Listclock1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHotelBookingCanceled: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hotel_booking_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhavecanceledOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_have_cancel)

)

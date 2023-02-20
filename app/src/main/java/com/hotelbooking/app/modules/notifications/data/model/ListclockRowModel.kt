package com.hotelbooking.app.modules.notifications.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ListclockRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentSuccessful: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payment_success2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLalunaHotelbooking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_laluna_hotel_bo)

)

package com.hotelbooking.app.modules.cancelbooking.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class CancelBookingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelBooking: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cancel_booking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_yo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOnly80ofthe: String? = MyApp.getInstance().resources.getString(R.string.msg_only_80_of_the)

)

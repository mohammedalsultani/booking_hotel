package com.hotelbooking.app.modules.refundmethod.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class RefundMethodModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCancelHotelBooking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cancel_hotel_bo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseselecta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_select_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_paid_479_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_refund_383_8)

)

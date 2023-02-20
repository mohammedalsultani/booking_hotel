package com.hotelbooking.app.modules.bookingcancelled.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookingCancelledModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresident: String? =
      MyApp.getInstance().resources.getString(R.string.msg_palms_casino_re)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParisFrance: String? = MyApp.getInstance().resources.getString(R.string.msg_london_united)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheMarkHotel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_the_mark_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_luxemburg_germ)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusErrorComponentAlertValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusErrorComponentAlertOneValue: String? = null
)

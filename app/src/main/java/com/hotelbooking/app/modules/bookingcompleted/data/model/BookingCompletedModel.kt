package com.hotelbooking.app.modules.bookingcompleted.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookingCompletedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresident: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_bulgari_resort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hotel_martinez)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountryOne: String? = MyApp.getInstance().resources.getString(R.string.msg_amsterdam_neth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusSuccessValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusSuccessOneValue: String? = null
)

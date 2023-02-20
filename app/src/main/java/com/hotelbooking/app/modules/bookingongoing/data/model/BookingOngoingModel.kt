package com.hotelbooking.app.modules.bookingongoing.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookingOngoingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresidentTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_monte_carlo_hot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParisFrance: String? = MyApp.getInstance().resources.getString(R.string.lbl_rome_italia)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStyleInvertedOneValue: String? = null
)

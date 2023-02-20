package com.hotelbooking.app.modules.homescreen.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class HotelsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmeraldaDeHotelOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_emeralda_de_hot)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_292)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPernight: String? = MyApp.getInstance().resources.getString(R.string.lbl_per_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRatingsValue: String? = null
)

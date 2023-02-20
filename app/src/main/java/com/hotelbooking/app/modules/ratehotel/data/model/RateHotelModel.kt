package com.hotelbooking.app.modules.ratehotel.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class RateHotelModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRatetheHotel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_rate_the_hotel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBulgariResort: String? =
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
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4378reviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_378_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_night)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleasegiveyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_give_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.msg_the_rooms_are_v)

)

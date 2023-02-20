package com.hotelbooking.app.modules.homescreen.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtComfort: String? = MyApp.getInstance().resources.getString(R.string.lbl_comfort)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloDaniel: String? = MyApp.getInstance().resources.getString(R.string.msg_hello_daniel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyBooked: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_booked)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)

)

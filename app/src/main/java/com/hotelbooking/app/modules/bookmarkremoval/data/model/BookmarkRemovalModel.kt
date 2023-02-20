package com.hotelbooking.app.modules.bookmarkremoval.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookmarkRemovalModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRemovefromBookmark: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remove_from_boo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmeraldaHotel: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_president_hotel)
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
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_35)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_night)

)

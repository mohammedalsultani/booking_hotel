package com.hotelbooking.app.modules.mybookmarks.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class MybookmarksRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.msg_president_mila)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRating: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_paris_france)
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

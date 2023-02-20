package com.hotelbooking.app.modules.review.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ListstarRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChips: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)

)

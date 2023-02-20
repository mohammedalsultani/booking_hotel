package com.hotelbooking.app.modules.searchfilter.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class Listsizemediumtypefilled2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeFilled: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_hotel)

)

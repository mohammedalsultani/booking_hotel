package com.hotelbooking.app.modules.filterresult.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class Listsizemediumtypefilled3RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeFilled: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_hotel)

)

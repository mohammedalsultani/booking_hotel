package com.hotelbooking.app.modules.searchpage.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ListsizemediumtypefilledRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeFilled: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_all_hotel)

)

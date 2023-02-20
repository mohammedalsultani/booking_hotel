package com.hotelbooking.app.modules.forgotpassword.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ListvolumeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_via_sms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_111_99)

)

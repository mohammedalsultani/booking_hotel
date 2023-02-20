package com.hotelbooking.app.modules.viewticket.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ViewticketRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtName: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamevalue: String? = MyApp.getInstance().resources.getString(R.string.lbl_daniel_austin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhoneNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonenumbervalue: String? =
      MyApp.getInstance().resources.getString(R.string.msg_1_123_456_789_000)

)

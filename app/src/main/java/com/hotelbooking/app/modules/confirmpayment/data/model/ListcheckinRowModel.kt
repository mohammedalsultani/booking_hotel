package com.hotelbooking.app.modules.confirmpayment.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ListcheckinRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckin: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckoutdate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_16_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckout: String? = MyApp.getInstance().resources.getString(R.string.lbl_check_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckoutdateOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_december_20_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGuest: String? = MyApp.getInstance().resources.getString(R.string.lbl_guest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNumberofguests: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)

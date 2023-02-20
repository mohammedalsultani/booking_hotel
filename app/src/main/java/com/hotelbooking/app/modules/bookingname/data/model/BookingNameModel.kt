package com.hotelbooking.app.modules.bookingname.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class BookingNameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNameofReservation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_reserva)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeFilled: String? = MyApp.getInstance().resources.getString(R.string.lbl_mr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeBorder: String? = MyApp.getInstance().resources.getString(R.string.lbl_mrs)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSizeMediumTypeBorderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTypeDefaultValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etStatusFillTypeDefaultOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhoneValue: String? = null
)

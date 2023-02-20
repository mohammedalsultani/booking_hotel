package com.hotelbooking.app.modules.paymentsuccessful.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModalTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_payment_success)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_successfully_ma)

)

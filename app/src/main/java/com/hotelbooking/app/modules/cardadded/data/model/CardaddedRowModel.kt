package com.hotelbooking.app.modules.cardadded.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class CardaddedRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethod: String? = MyApp.getInstance().resources.getString(R.string.lbl_paypal)

)

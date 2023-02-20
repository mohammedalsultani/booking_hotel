package com.hotelbooking.app.modules.resetpasswordsuccessful.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtModalTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_congratulations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_is)

)

package com.hotelbooking.app.modules.forgotpasswordtypeotp.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordTypeOtpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCodehasbeensendOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_code_has_been_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResendcodeinFiftyFive: String? =
      MyApp.getInstance().resources.getString(R.string.msg_resend_code_in2)

)

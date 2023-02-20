package com.hotelbooking.app.modules.signin.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoyourAccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotthepassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_the_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewith: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)

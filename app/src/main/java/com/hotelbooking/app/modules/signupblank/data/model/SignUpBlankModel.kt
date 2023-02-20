package com.hotelbooking.app.modules.signupblank.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpBlankModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyourAccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
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
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
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

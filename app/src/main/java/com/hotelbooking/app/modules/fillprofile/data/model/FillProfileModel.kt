package com.hotelbooking.app.modules.fillprofile.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class FillProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFillYourProfileOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fill_your_profi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFullnameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etNicknameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateofbirthValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPhonenumberValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGenderValue: String? = null
)

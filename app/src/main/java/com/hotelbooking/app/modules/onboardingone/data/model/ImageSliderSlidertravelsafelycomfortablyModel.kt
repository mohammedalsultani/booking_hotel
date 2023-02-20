package com.hotelbooking.app.modules.onboardingone.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlidertravelsafelycomfortablyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTravelsafelycomfortably: String? =
      MyApp.getInstance().resources.getString(R.string.msg_travel_safely)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolorOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)

)

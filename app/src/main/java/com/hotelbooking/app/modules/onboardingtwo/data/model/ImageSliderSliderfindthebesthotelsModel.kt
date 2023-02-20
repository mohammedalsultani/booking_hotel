package com.hotelbooking.app.modules.onboardingtwo.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderfindthebesthotelsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFindthebesthotels: String? =
      MyApp.getInstance().resources.getString(R.string.msg_find_the_best_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolorOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol3)

)

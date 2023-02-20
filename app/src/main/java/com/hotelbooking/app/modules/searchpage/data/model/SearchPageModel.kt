package com.hotelbooking.app.modules.searchpage.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class SearchPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecommended586379: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recommended_58)

)

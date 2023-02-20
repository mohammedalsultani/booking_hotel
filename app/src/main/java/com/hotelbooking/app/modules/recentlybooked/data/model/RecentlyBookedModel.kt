package com.hotelbooking.app.modules.recentlybooked.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class RecentlyBookedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyBooked: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_recently_booked)

)

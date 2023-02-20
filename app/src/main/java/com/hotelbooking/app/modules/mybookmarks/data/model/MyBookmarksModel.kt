package com.hotelbooking.app.modules.mybookmarks.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class MyBookmarksModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyBookmarks: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_bookmarks)

)

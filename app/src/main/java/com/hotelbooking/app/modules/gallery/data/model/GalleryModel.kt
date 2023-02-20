package com.hotelbooking.app.modules.gallery.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class GalleryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGalleryHotelPhotos: String? =
      MyApp.getInstance().resources.getString(R.string.msg_gallery_hotel_p)

)

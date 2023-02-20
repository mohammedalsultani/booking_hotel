package com.hotelbooking.app.modules.hoteldetails.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class HotelDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_79_place_de_la)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGalleryPhotos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_gallery_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDetails: String? = MyApp.getInstance().resources.getString(R.string.lbl_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHotels: String? = MyApp.getInstance().resources.getString(R.string.lbl_hotels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBedroomsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_bedrooms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBathroomsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2_bathrooms)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSqftCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4000_sqft)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFacilites: String? = MyApp.getInstance().resources.getString(R.string.lbl_facilites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSwimmingPool: String? = MyApp.getInstance().resources.getString(R.string.lbl_swimming_pool)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWiFi: String? = MyApp.getInstance().resources.getString(R.string.lbl_wifi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestaurant: String? = MyApp.getInstance().resources.getString(R.string.lbl_restaurant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParking: String? = MyApp.getInstance().resources.getString(R.string.lbl_parking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeetingRoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_meeting_room)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtElevator: String? = MyApp.getInstance().resources.getString(R.string.lbl_elevator)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFitnessCenter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_fitness_center)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt24hoursOpen: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_hours_open)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLocationOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4981reviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_981_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeAllOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_292)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNight: String? = MyApp.getInstance().resources.getString(R.string.lbl_night)

)

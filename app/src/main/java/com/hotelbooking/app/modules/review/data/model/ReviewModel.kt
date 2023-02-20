package com.hotelbooking.app.modules.review.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ReviewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReview: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRating: String? = MyApp.getInstance().resources.getString(R.string.lbl_rating)
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

)

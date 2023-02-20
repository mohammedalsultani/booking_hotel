package com.hotelbooking.app.modules.viewticket.`data`.model

import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import kotlin.String

data class ViewTicketModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTicket: String? = MyApp.getInstance().resources.getString(R.string.lbl_ticket)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRoyalePresidentOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_royale_presiden)

)

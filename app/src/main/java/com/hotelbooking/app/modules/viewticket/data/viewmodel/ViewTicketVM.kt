package com.hotelbooking.app.modules.viewticket.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.viewticket.`data`.model.ViewTicketModel
import com.hotelbooking.app.modules.viewticket.`data`.model.ViewticketRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ViewTicketVM : ViewModel(), KoinComponent {
  val viewTicketModel: MutableLiveData<ViewTicketModel> = MutableLiveData(ViewTicketModel())

  var navArguments: Bundle? = null

  val viewticketList: MutableLiveData<MutableList<ViewticketRowModel>> =
      MutableLiveData(mutableListOf())
}

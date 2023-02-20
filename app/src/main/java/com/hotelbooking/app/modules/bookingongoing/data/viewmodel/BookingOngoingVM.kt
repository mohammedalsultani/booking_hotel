package com.hotelbooking.app.modules.bookingongoing.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.bookingongoing.`data`.model.BookingOngoingModel
import org.koin.core.KoinComponent

class BookingOngoingVM : ViewModel(), KoinComponent {
  val bookingOngoingModel: MutableLiveData<BookingOngoingModel> =
      MutableLiveData(BookingOngoingModel())

  var navArguments: Bundle? = null
}

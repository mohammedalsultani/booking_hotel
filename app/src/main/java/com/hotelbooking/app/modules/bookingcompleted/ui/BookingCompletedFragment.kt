package com.hotelbooking.app.modules.bookingcompleted.ui

import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseFragment
import com.hotelbooking.app.databinding.FragmentBookingCompletedBinding
import com.hotelbooking.app.modules.bookingcompleted.`data`.viewmodel.BookingCompletedVM
import kotlin.String
import kotlin.Unit

class BookingCompletedFragment :
    BaseFragment<FragmentBookingCompletedBinding>(R.layout.fragment_booking_completed) {
  private val viewModel: BookingCompletedVM by viewModels<BookingCompletedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingCompletedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BOOKING_COMPLETED_FRAGMENT"

  }
}

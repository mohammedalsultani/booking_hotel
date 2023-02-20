package com.hotelbooking.app.modules.bookingongoing.ui

import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseFragment
import com.hotelbooking.app.databinding.FragmentBookingOngoingBinding
import com.hotelbooking.app.modules.bookingongoing.`data`.viewmodel.BookingOngoingVM
import com.hotelbooking.app.modules.cancelbooking.ui.CancelBookingBottomsheet
import kotlin.String
import kotlin.Unit

class BookingOngoingFragment :
    BaseFragment<FragmentBookingOngoingBinding>(R.layout.fragment_booking_ongoing) {
  private val viewModel: BookingOngoingVM by viewModels<BookingOngoingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingOngoingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCancelbooking.setOnClickListener {
      val destFragment = CancelBookingBottomsheet.getInstance(null)
      destFragment.show(requireActivity().supportFragmentManager, CancelBookingBottomsheet.TAG)
    }
  }

  companion object {
    const val TAG: String = "BOOKING_ONGOING_FRAGMENT"

  }
}

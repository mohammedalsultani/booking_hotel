package com.hotelbooking.app.modules.bookingongoingtabcontainer.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityBookingOngoingTabContainerBinding
import com.hotelbooking.app.modules.bookingongoingtabcontainer.`data`.viewmodel.BookingOngoingTabContainerVM
import kotlin.String
import kotlin.Unit

class BookingOngoingTabContainerActivity :
    BaseActivity<ActivityBookingOngoingTabContainerBinding>(R.layout.activity_booking_ongoing_tab_container)
    {
  private val viewModel: BookingOngoingTabContainerVM by viewModels<BookingOngoingTabContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookingOngoingTabContainerVM = viewModel
    val adapter =
    BookingOngoingTabContainerActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup137,binding.viewPagerTabbarview) { tab, position ->
      tab.text = BookingOngoingTabContainerActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "BOOKING_ONGOING_TAB_CONTAINER_ACTIVITY"

    }
  }

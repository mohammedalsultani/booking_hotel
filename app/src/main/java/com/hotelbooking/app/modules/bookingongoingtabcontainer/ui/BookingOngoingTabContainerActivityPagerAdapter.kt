package com.hotelbooking.app.modules.bookingongoingtabcontainer.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.di.MyApp
import com.hotelbooking.app.modules.bookingcancelled.ui.BookingCancelledFragment
import com.hotelbooking.app.modules.bookingcompleted.ui.BookingCompletedFragment
import com.hotelbooking.app.modules.bookingongoing.ui.BookingOngoingFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class BookingOngoingTabContainerActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_ongoing),MyApp.getInstance().resources.getString(R.string.lbl_completed),MyApp.getInstance().resources.getString(R.string.lbl_canceled))

        val viewPages: List<Fragment> =
                listOf(BookingOngoingFragment(),BookingCompletedFragment(),BookingCancelledFragment())

    }
}

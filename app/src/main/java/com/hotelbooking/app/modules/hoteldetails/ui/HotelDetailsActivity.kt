package com.hotelbooking.app.modules.hoteldetails.ui

import android.view.View
import androidx.activity.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityHotelDetailsBinding
import com.hotelbooking.app.modules.gallery.ui.GalleryActivity
import com.hotelbooking.app.modules.hoteldetails.`data`.model.HoteldetailsRowModel
import com.hotelbooking.app.modules.hoteldetails.`data`.model.SpinnerTypeButtonTypeModel
import com.hotelbooking.app.modules.hoteldetails.`data`.viewmodel.HotelDetailsVM
import com.hotelbooking.app.modules.review.ui.ReviewActivity
import com.hotelbooking.app.modules.selectdateguest.ui.SelectDateGuestActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HotelDetailsActivity :
    BaseActivity<ActivityHotelDetailsBinding>(R.layout.activity_hotel_details), OnMapReadyCallback {
  private val viewModel: HotelDetailsVM by viewModels<HotelDetailsVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerTypeButtonTypeList.value = mutableListOf(
    SpinnerTypeButtonTypeModel("Item1"),
    SpinnerTypeButtonTypeModel("Item2"),
    SpinnerTypeButtonTypeModel("Item3"),
    SpinnerTypeButtonTypeModel("Item4"),
    SpinnerTypeButtonTypeModel("Item5")
    )
    val spinnerTypeButtonTypeAdapter =
    SpinnerTypeButtonTypeAdapter(this,R.layout.spinner_item,viewModel.spinnerTypeButtonTypeList.value?:
    mutableListOf())
    binding.spinnerTypeButtonType.adapter = spinnerTypeButtonTypeAdapter
    val hoteldetailsAdapter =
    HoteldetailsAdapter(viewModel.hoteldetailsList.value?:mutableListOf())
    binding.recyclerHoteldetails.adapter = hoteldetailsAdapter
    hoteldetailsAdapter.setOnItemClickListener(
    object : HoteldetailsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HoteldetailsRowModel) {
        onClickRecyclerHoteldetails(view, position, item)
      }
    }
    )
    viewModel.hoteldetailsList.observe(this) {
      hoteldetailsAdapter.updateData(it)
    }
    binding.hotelDetailsVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapImageFive) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtSeeAll.setOnClickListener {
      val destIntent = GalleryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtSeeAllOne.setOnClickListener {
      val destIntent = ReviewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBooknow.setOnClickListener {
      val destIntent = SelectDateGuestActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerHoteldetails(
    view: View,
    position: Int,
    item: HoteldetailsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOTEL_DETAILS_ACTIVITY"

  }
}

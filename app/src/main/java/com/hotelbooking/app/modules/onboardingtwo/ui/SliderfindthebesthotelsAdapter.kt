package com.hotelbooking.app.modules.onboardingtwo.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hotelbooking.app.databinding.SlideritemOnboardingTwo1Binding
import com.hotelbooking.app.modules.onboardingtwo.`data`.model.ImageSliderSliderfindthebesthotelsModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderfindthebesthotelsAdapter(
  val dataList: ArrayList<ImageSliderSliderfindthebesthotelsModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderfindthebesthotelsModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingTwo1Binding) {
      binding.imageSliderSliderfindthebesthotelsModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingTwo1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

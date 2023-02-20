package com.hotelbooking.app.modules.onboardingone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hotelbooking.app.databinding.SlideritemOnboardingOne1Binding
import com.hotelbooking.app.modules.onboardingone.`data`.model.ImageSliderSlidertravelsafelycomfortablyModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidertravelsafelycomfortablyAdapter(
  val dataList: ArrayList<ImageSliderSlidertravelsafelycomfortablyModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidertravelsafelycomfortablyModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingOne1Binding) {
      binding.imageSliderSlidertravelsafelycomfortablyModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingOne1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

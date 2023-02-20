package com.hotelbooking.app.modules.onboardingthree.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hotelbooking.app.databinding.SlideritemOnboardingThree1Binding
import com.hotelbooking.app.modules.onboardingthree.`data`.model.ImageSliderSlidernameModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidernameAdapter(
  val dataList: ArrayList<ImageSliderSlidernameModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidernameModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemOnboardingThree1Binding) {
      binding.imageSliderSlidernameModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemOnboardingThree1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}

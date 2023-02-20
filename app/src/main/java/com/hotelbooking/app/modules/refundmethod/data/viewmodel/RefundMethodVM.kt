package com.hotelbooking.app.modules.refundmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.refundmethod.`data`.model.RefundMethodModel
import com.hotelbooking.app.modules.refundmethod.`data`.model.RefundmethodRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RefundMethodVM : ViewModel(), KoinComponent {
  val refundMethodModel: MutableLiveData<RefundMethodModel> = MutableLiveData(RefundMethodModel())

  var navArguments: Bundle? = null

  val refundmethodList: MutableLiveData<MutableList<RefundmethodRowModel>> =
      MutableLiveData(mutableListOf())
}

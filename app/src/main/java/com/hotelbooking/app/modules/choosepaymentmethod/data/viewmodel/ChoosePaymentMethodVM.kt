package com.hotelbooking.app.modules.choosepaymentmethod.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.choosepaymentmethod.`data`.model.ChoosePaymentMethodModel
import com.hotelbooking.app.modules.choosepaymentmethod.`data`.model.ListgoogleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ChoosePaymentMethodVM : ViewModel(), KoinComponent {
  val choosePaymentMethodModel: MutableLiveData<ChoosePaymentMethodModel> =
      MutableLiveData(ChoosePaymentMethodModel())

  var navArguments: Bundle? = null

  val listgoogleList: MutableLiveData<MutableList<ListgoogleRowModel>> =
      MutableLiveData(mutableListOf())
}

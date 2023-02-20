package com.hotelbooking.app.modules.fillprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.fillprofile.`data`.model.FillProfileModel
import org.koin.core.KoinComponent

class FillProfileVM : ViewModel(), KoinComponent {
  val fillProfileModel: MutableLiveData<FillProfileModel> = MutableLiveData(FillProfileModel())

  var navArguments: Bundle? = null
}

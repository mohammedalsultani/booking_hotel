package com.hotelbooking.app.modules.cardadded.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hotelbooking.app.modules.cardadded.`data`.model.CardAddedModel
import com.hotelbooking.app.modules.cardadded.`data`.model.CardaddedRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CardAddedVM : ViewModel(), KoinComponent {
  val cardAddedModel: MutableLiveData<CardAddedModel> = MutableLiveData(CardAddedModel())

  var navArguments: Bundle? = null

  val cardaddedList: MutableLiveData<MutableList<CardaddedRowModel>> =
      MutableLiveData(mutableListOf())
}

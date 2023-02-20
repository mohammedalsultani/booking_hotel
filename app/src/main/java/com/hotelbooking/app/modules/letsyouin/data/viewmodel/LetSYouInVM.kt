package com.hotelbooking.app.modules.letsyouin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.hotelbooking.app.modules.letsyouin.`data`.model.LetSYouInModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LetSYouInVM : ViewModel(), KoinComponent {
  val letSYouInModel: MutableLiveData<LetSYouInModel> = MutableLiveData(LetSYouInModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}

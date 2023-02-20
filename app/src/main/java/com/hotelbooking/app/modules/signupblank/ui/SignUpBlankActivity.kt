package com.hotelbooking.app.modules.signupblank.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.appcomponents.googleauth.GoogleHelper
import com.hotelbooking.app.databinding.ActivitySignUpBlankBinding
import com.hotelbooking.app.modules.fillprofile.ui.FillProfileActivity
import com.hotelbooking.app.modules.signin.ui.SignInActivity
import com.hotelbooking.app.modules.signupblank.`data`.viewmodel.SignUpBlankVM
import kotlin.String
import kotlin.Unit

class SignUpBlankActivity :
    BaseActivity<ActivitySignUpBlankBinding>(R.layout.activity_sign_up_blank) {
  private val viewModel: SignUpBlankVM by viewModels<SignUpBlankVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpBlankVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
      binding.btnSignup.setOnClickListener {
        val destIntent = FillProfileActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtSignin.setOnClickListener {
        val destIntent = SignInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGN_UP_BLANK_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignUpBlankActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

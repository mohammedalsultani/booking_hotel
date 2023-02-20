package com.hotelbooking.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.appcomponents.googleauth.GoogleHelper
import com.hotelbooking.app.databinding.ActivitySignInBinding
import com.hotelbooking.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.hotelbooking.app.modules.signin.`data`.viewmodel.SignInVM
import com.hotelbooking.app.modules.signupblank.ui.SignUpBlankActivity
import kotlin.String
import kotlin.Unit

class SignInActivity : BaseActivity<ActivitySignInBinding>(R.layout.activity_sign_in) {
  private val viewModel: SignInVM by viewModels<SignInVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signInVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.txtSignup.setOnClickListener {
        val destIntent = SignUpBlankActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.txtForgotthepassword.setOnClickListener {
        val destIntent = ForgotPasswordActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGN_IN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignInActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }

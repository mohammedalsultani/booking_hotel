package com.hotelbooking.app.modules.bookmarkremoval.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.hotelbooking.app.databinding.BottomsheetBookmarkRemovalBinding
import com.hotelbooking.app.modules.bookmarkremoval.`data`.viewmodel.BookmarkRemovalVM
import kotlin.String
import kotlin.Unit

class BookmarkRemovalBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetBookmarkRemovalBinding>(R.layout.bottomsheet_bookmark_removal)
    {
  private val viewModel: BookmarkRemovalVM by viewModels<BookmarkRemovalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookmarkRemovalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BOOKMARK_REMOVAL_BOTTOMSHEET"


    fun getInstance(bundle: Bundle?): BookmarkRemovalBottomsheet {
      val fragment = BookmarkRemovalBottomsheet()
      fragment.arguments = bundle
      return fragment
    }
  }
}

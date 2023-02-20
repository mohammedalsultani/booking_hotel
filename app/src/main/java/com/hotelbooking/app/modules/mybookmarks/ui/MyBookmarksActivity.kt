package com.hotelbooking.app.modules.mybookmarks.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.hotelbooking.app.R
import com.hotelbooking.app.appcomponents.base.BaseActivity
import com.hotelbooking.app.databinding.ActivityMyBookmarksBinding
import com.hotelbooking.app.modules.bookmarkremoval.ui.BookmarkRemovalBottomsheet
import com.hotelbooking.app.modules.mybookmarks.`data`.model.MybookmarksRowModel
import com.hotelbooking.app.modules.mybookmarks.`data`.viewmodel.MyBookmarksVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MyBookmarksActivity : BaseActivity<ActivityMyBookmarksBinding>(R.layout.activity_my_bookmarks)
    {
  private val viewModel: MyBookmarksVM by viewModels<MyBookmarksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mybookmarksAdapter =
    MybookmarksAdapter(viewModel.mybookmarksList.value?:mutableListOf())
    binding.recyclerMybookmarks.adapter = mybookmarksAdapter
    mybookmarksAdapter.setOnItemClickListener(
    object : MybookmarksAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MybookmarksRowModel) {
        onClickRecyclerMybookmarks(view, position, item)
      }
    }
    )
    viewModel.mybookmarksList.observe(this) {
      mybookmarksAdapter.updateData(it)
    }
    binding.myBookmarksVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerMybookmarks(
    view: View,
    position: Int,
    item: MybookmarksRowModel
  ): Unit {
    when(view.id) {
      R.id.imageBookmark ->  {
        val destFragment = BookmarkRemovalBottomsheet.getInstance(null)
        destFragment.show(this.supportFragmentManager, BookmarkRemovalBottomsheet.TAG)
      }
    }
  }

  companion object {
    const val TAG: String = "MY_BOOKMARKS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MyBookmarksActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}

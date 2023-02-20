package com.hotelbooking.app.modules.mybookmarks.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowMybookmarksBinding
import com.hotelbooking.app.modules.mybookmarks.`data`.model.MybookmarksRowModel
import kotlin.Int
import kotlin.collections.List

class MybookmarksAdapter(
  var list: List<MybookmarksRowModel>
) : RecyclerView.Adapter<MybookmarksAdapter.RowMybookmarksVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMybookmarksVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mybookmarks,parent,false)
    return RowMybookmarksVH(view)
  }

  override fun onBindViewHolder(holder: RowMybookmarksVH, position: Int) {
    val mybookmarksRowModel = MybookmarksRowModel()
    // TODO uncomment following line after integration with data source
    // val mybookmarksRowModel = list[position]
    holder.binding.mybookmarksRowModel = mybookmarksRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MybookmarksRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: MybookmarksRowModel
    ) {
    }
  }

  inner class RowMybookmarksVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMybookmarksBinding = RowMybookmarksBinding.bind(itemView)
    init {
      binding.imageBookmark.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, MybookmarksRowModel())
      }
    }
  }
}

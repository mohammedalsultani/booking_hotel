package com.hotelbooking.app.modules.filterresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowListrectanglefour4Binding
import com.hotelbooking.app.modules.filterresult.`data`.model.Listrectanglefour4RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefourAdapter(
  var list: List<Listrectanglefour4RowModel>
) : RecyclerView.Adapter<ListrectanglefourAdapter.RowListrectanglefour4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefour4VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefour4,parent,false)
    return RowListrectanglefour4VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefour4VH, position: Int) {
    val listrectanglefour4RowModel = Listrectanglefour4RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefour4RowModel = list[position]
    holder.binding.listrectanglefour4RowModel = listrectanglefour4RowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefour4RowModel>) {
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
      item: Listrectanglefour4RowModel
    ) {
    }
  }

  inner class RowListrectanglefour4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefour4Binding = RowListrectanglefour4Binding.bind(itemView)
  }
}

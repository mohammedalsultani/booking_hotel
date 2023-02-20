package com.hotelbooking.app.modules.viewticket.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowViewticketBinding
import com.hotelbooking.app.modules.viewticket.`data`.model.ViewticketRowModel
import kotlin.Int
import kotlin.collections.List

class ViewticketAdapter(
  var list: List<ViewticketRowModel>
) : RecyclerView.Adapter<ViewticketAdapter.RowViewticketVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewticketVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_viewticket,parent,false)
    return RowViewticketVH(view)
  }

  override fun onBindViewHolder(holder: RowViewticketVH, position: Int) {
    val viewticketRowModel = ViewticketRowModel()
    // TODO uncomment following line after integration with data source
    // val viewticketRowModel = list[position]
    holder.binding.viewticketRowModel = viewticketRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ViewticketRowModel>) {
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
      item: ViewticketRowModel
    ) {
    }
  }

  inner class RowViewticketVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowViewticketBinding = RowViewticketBinding.bind(itemView)
  }
}

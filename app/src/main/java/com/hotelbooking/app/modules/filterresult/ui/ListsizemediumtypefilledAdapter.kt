package com.hotelbooking.app.modules.filterresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowListsizemediumtypefilled3Binding
import com.hotelbooking.app.modules.filterresult.`data`.model.Listsizemediumtypefilled3RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefilledAdapter(
  var list: List<Listsizemediumtypefilled3RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefilledAdapter.RowListsizemediumtypefilled3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListsizemediumtypefilled3VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypefilled3,parent,false)
    return RowListsizemediumtypefilled3VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypefilled3VH, position: Int) {
    val listsizemediumtypefilled3RowModel = Listsizemediumtypefilled3RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypefilled3RowModel = list[position]
    holder.binding.listsizemediumtypefilled3RowModel = listsizemediumtypefilled3RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypefilled3RowModel>) {
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
      item: Listsizemediumtypefilled3RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypefilled3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypefilled3Binding =
        RowListsizemediumtypefilled3Binding.bind(itemView)
  }
}

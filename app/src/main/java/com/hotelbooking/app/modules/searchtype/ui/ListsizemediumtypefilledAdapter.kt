package com.hotelbooking.app.modules.searchtype.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowListsizemediumtypefilled1Binding
import com.hotelbooking.app.modules.searchtype.`data`.model.Listsizemediumtypefilled1RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefilledAdapter(
  var list: List<Listsizemediumtypefilled1RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefilledAdapter.RowListsizemediumtypefilled1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListsizemediumtypefilled1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypefilled1,parent,false)
    return RowListsizemediumtypefilled1VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypefilled1VH, position: Int) {
    val listsizemediumtypefilled1RowModel = Listsizemediumtypefilled1RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypefilled1RowModel = list[position]
    holder.binding.listsizemediumtypefilled1RowModel = listsizemediumtypefilled1RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypefilled1RowModel>) {
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
      item: Listsizemediumtypefilled1RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypefilled1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypefilled1Binding =
        RowListsizemediumtypefilled1Binding.bind(itemView)
  }
}

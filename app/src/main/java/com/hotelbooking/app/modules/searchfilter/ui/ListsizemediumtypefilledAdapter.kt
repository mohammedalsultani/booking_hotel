package com.hotelbooking.app.modules.searchfilter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowListsizemediumtypefilled2Binding
import com.hotelbooking.app.modules.searchfilter.`data`.model.Listsizemediumtypefilled2RowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefilledAdapter(
  var list: List<Listsizemediumtypefilled2RowModel>
) : RecyclerView.Adapter<ListsizemediumtypefilledAdapter.RowListsizemediumtypefilled2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
      RowListsizemediumtypefilled2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypefilled2,parent,false)
    return RowListsizemediumtypefilled2VH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypefilled2VH, position: Int) {
    val listsizemediumtypefilled2RowModel = Listsizemediumtypefilled2RowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypefilled2RowModel = list[position]
    holder.binding.listsizemediumtypefilled2RowModel = listsizemediumtypefilled2RowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsizemediumtypefilled2RowModel>) {
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
      item: Listsizemediumtypefilled2RowModel
    ) {
    }
  }

  inner class RowListsizemediumtypefilled2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypefilled2Binding =
        RowListsizemediumtypefilled2Binding.bind(itemView)
  }
}

package com.hotelbooking.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowListsizemediumtypefilledBinding
import com.hotelbooking.app.modules.searchpage.`data`.model.ListsizemediumtypefilledRowModel
import kotlin.Int
import kotlin.collections.List

class ListsizemediumtypefilledAdapter(
  var list: List<ListsizemediumtypefilledRowModel>
) : RecyclerView.Adapter<ListsizemediumtypefilledAdapter.RowListsizemediumtypefilledVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsizemediumtypefilledVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsizemediumtypefilled,parent,false)
    return RowListsizemediumtypefilledVH(view)
  }

  override fun onBindViewHolder(holder: RowListsizemediumtypefilledVH, position: Int) {
    val listsizemediumtypefilledRowModel = ListsizemediumtypefilledRowModel()
    // TODO uncomment following line after integration with data source
    // val listsizemediumtypefilledRowModel = list[position]
    holder.binding.listsizemediumtypefilledRowModel = listsizemediumtypefilledRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsizemediumtypefilledRowModel>) {
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
      item: ListsizemediumtypefilledRowModel
    ) {
    }
  }

  inner class RowListsizemediumtypefilledVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsizemediumtypefilledBinding =
        RowListsizemediumtypefilledBinding.bind(itemView)
  }
}

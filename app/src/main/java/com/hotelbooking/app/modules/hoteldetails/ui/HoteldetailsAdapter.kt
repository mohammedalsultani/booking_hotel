package com.hotelbooking.app.modules.hoteldetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hotelbooking.app.R
import com.hotelbooking.app.databinding.RowHoteldetailsBinding
import com.hotelbooking.app.modules.hoteldetails.`data`.model.HoteldetailsRowModel
import kotlin.Int
import kotlin.collections.List

class HoteldetailsAdapter(
  var list: List<HoteldetailsRowModel>
) : RecyclerView.Adapter<HoteldetailsAdapter.RowHoteldetailsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHoteldetailsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hoteldetails,parent,false)
    return RowHoteldetailsVH(view)
  }

  override fun onBindViewHolder(holder: RowHoteldetailsVH, position: Int) {
    val hoteldetailsRowModel = HoteldetailsRowModel()
    // TODO uncomment following line after integration with data source
    // val hoteldetailsRowModel = list[position]
    holder.binding.hoteldetailsRowModel = hoteldetailsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HoteldetailsRowModel>) {
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
      item: HoteldetailsRowModel
    ) {
    }
  }

  inner class RowHoteldetailsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHoteldetailsBinding = RowHoteldetailsBinding.bind(itemView)
  }
}

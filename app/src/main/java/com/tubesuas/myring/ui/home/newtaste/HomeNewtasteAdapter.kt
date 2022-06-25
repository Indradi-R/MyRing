package com.tubesuas.myring.ui.home.newtaste

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.tubesuas.myring.R
import com.tubesuas.myring.model.response.home.Data
import com.tubesuas.myring.utils.Helpers.formatPrice
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_home_vertical.view.*

class HomeNewtasteAdapter (
    private val listData : List<Data>,
    private val itemAdapterCallback : ItemAdapterCallback,
) : RecyclerView.Adapter<HomeNewtasteAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_home_vertical, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listData[position], itemAdapterCallback)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    class ViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data : Data, itemAdapterCallback: ItemAdapterCallback) {
            itemView.apply {
                tvTitle.text = data.name
                tvPrice.formatPrice(data.price.toString())
                rbFood.rating = data.rate?.toFloat() ?: 0f

                Glide.with(context)
                    .load(data.picturePath)
                    .into(ivPoster)

                itemView.setOnClickListener { itemAdapterCallback.onClick(it, data) }
                btnDetail.setOnClickListener{
                    itemAdapterCallback.onClick(it, data)
                }
                btnLokasi.setOnClickListener{
                    // lokasi Dapoerdjinggo
                    val gmmIntentUri = Uri.parse("geo:-8.5904387,116.0892647?q=restaurants")
                    val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                    mapIntent.setPackage("com.google.android.apps.maps")
                    mapIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    mapIntent.resolveActivity(context.packageManager)?.let {
                        context.applicationContext.startActivity(mapIntent)
                    }
                }
            }
        }
    }

    interface ItemAdapterCallback {
        fun onClick(v: View, data:Data)
    }

}
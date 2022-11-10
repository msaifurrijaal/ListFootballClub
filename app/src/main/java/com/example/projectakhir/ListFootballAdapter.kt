package com.example.projectakhir

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFootballAdapter(private val listFootball: ArrayList<Football>) : RecyclerView.Adapter<ListFootballAdapter.ListViewHolder>() {
    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    // Menghubungkan ViewHolder dengan view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_football, parent, false)
        return ListViewHolder(view)
    }

    // Mengubah nilai pahlawan sesuai dengan posisinya
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val football = listFootball[position]
        Glide.with(holder.itemView.context)
            .load(football.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = football.name
        holder.tvDetail.text = football.detail

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val footballDetail = Intent(context, DetailFootballActivity::class.java)
            footballDetail.putExtra(DetailFootballActivity.FOOTBALL_NAME, football.name)
            footballDetail.putExtra(DetailFootballActivity.FOOTBALL_IMAGE, football.photo)
            footballDetail.putExtra(DetailFootballActivity.FOOTBALL_DESCRIPTION, football.detail)
            context.startActivity(footballDetail)
        }
    }

    override fun getItemCount(): Int {
        return listFootball.size
    }
}
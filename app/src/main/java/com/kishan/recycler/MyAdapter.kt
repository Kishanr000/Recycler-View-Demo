package com.kishan.recyclerview_demo

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.kishan.recycler.R

class MyAdapter(var data: ArrayList<News>, var context: Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    // create view instance if layout manager fails
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        val currentItem = data[position]
        holder.headingTitle.text = currentItem.heading
        holder.imagess.setImageResource(currentItem.image)
    }
    // return no items
    override fun getItemCount(): Int {
        return data.size
    }
    // have to declare for views
    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val headingTitle = itemView.findViewById<TextView>(R.id.heading)
        val imagess = itemView.findViewById<ShapeableImageView>(R.id.images)
    }
}
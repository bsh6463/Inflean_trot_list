package com.example.trot_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val items: MutableList<String>): RecyclerView.Adapter<RvAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

        fun bindItems(item: String){
            val rv_text = itemView.findViewById<TextView>(R.id.rvTextId)
            rv_text.text = item
        }
    }
}
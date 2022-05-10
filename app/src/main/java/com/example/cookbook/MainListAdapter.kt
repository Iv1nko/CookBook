package com.example.cookbook

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainListAdapter : RecyclerView.Adapter<MainListAdapter.MainListViewHolder>() {


    var data = listOf<String>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MainListViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainListViewHolder, position: Int) {
        val dish = data.get(position)
        holder.rootView.findViewById<TextView>(R.id.title).text = dish
    }

    override fun getItemCount(): Int {
        return data.size
    }


    class MainListViewHolder(val rootView: View) : RecyclerView.ViewHolder(rootView) {

    }
}
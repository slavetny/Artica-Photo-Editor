package com.slavetny.articaeditor.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.slavetny.articaeditor.R

class FilterAdapter : RecyclerView.Adapter<FilterAdapter.FilterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.filter_item, parent, false)

        return FilterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 15
    }

    override fun onBindViewHolder(holder: FilterViewHolder, position: Int) {
        holder.bind()
    }

    class FilterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind() {

        }
    }
}
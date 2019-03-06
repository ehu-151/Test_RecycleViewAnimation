package com.example.ehu.test_recycleviewanimation

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.row_data.view.*

class DataAdapter(var items: List<String>): RecyclerView.Adapter<DataAdapter.RecyclerViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): RecyclerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.row_data, parent, false)

        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.text.text = items.get(position)
    }

    class RecyclerViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.text
    }
}
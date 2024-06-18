package com.akirachix.fibonumbers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class numbersRecyclerViewAdapter

class NamesRecyclerViewAdapter(var numbers: List<Int>) :
    RecyclerView.Adapter<NumbersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.numbers_list_item, parent, false)
        return NumbersViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        holder.tvNumber.text = numbers[position]
    }
}

class NamesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tvNumber = itemView.findViewById<TextView>(R.id.tvnumbers)
}

package com.example.androidbasicsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class MarkAdapter (
    var marks:List<Mark>
):RecyclerView.Adapter<MarkAdapter.MarkViewHolder>(){
    inner class MarkViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarkViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val cellRow= layoutInflater.inflate(R.layout.items_row,parent,false)
        return MarkViewHolder(cellRow)
    }
    override fun onBindViewHolder(holder: MarkViewHolder, position: Int) {
        holder.itemView.apply {
         //  holder?.tvvTitle.text=marks[position].title
           // checkBox.isChecked=marks[position].isChecked
        }

    }

    override fun getItemCount(): Int {

        return marks.size
    }

}
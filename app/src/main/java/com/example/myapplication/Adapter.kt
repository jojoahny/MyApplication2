package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(var list: ArrayList<data>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val image: ImageView = itemview.findViewById(R.id.Img2)
        val name: TextView = itemview.findViewById(R.id.Txt2)
        val age: TextView = itemview.findViewById(R.id.Txt3)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycle_element, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(list[position].img)
        holder.name.text = list[position].name
        holder.age.text = list[position].age.toString()
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Clicked: ${position + 1}", Toast.LENGTH_SHORT)
                .show()
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

}
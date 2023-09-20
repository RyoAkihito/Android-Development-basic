package com.example.myprojekandriod.Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojekandriod.R
import com.example.myprojekandriod.model.Doa

class LanguageAdapter (val data : ArrayList<Doa>) :
        RecyclerView.Adapter<LanguageAdapter.LanguageVIewHolder>() {

    class LanguageVIewHolder (view:View): RecyclerView.ViewHolder(view){
        val tvbahasapemrograman : TextView = view.findViewById(R.id.tv)
        val tvgambar : ImageView = view.findViewById(R.id.gambaraj)
    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageVIewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasapemrograman2,parent,false)
            return LanguageVIewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageVIewHolder, position: Int) {
        val item = data.get(position)
        holder.tvbahasapemrograman.text = item.Doa
        holder.tvgambar.setImageResource(item.Gambar)
    }

    override fun getItemCount(): Int = data.size

}

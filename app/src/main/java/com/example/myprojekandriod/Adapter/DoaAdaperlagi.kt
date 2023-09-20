package com.example.myprojekandriod.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojekandriod.R
import com.example.myprojekandriod.model.doa_harian

class DoaAdaperlagi (val data:ArrayList<doa_harian>)
    : RecyclerView.Adapter<DoaAdaperlagi.DoaViewHolder>()
{
    class DoaViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val tvnamdoaharian : TextView = view.findViewById(R.id.ivjuduldoa)
        val tvarab : TextView = view.findViewById(R.id.tvdoaarab)
        val latin : TextView = view.findViewById(R.id.tvdoalatin)
        val tvcollapse : ImageButton = view.findViewById(R.id.ibcollapse)
        val isidoa : RelativeLayout = view.findViewById(R.id.rlisidoa)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian,parent,false)
        return DoaViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvarab.text = item.arab
        holder.latin.text = item.latin
        holder.tvnamdoaharian.text = item.judul


        holder.tvcollapse.setOnClickListener {
            if(holder.isidoa.visibility == View.GONE){
                holder.isidoa.visibility = View.VISIBLE
                holder.tvcollapse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_down_24)
            }else{
                holder.isidoa.visibility = View.GONE
                holder.tvcollapse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
            }
        }
    }


}
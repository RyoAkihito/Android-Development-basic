package com.example.myprojekandriod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojekandriod.Adapter2.DoaAdapter
import com.example.myprojekandriod.model.Doa

class Latihan45 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan45)

        val Doa: RecyclerView =
            findViewById(R.id.listdzikir)

        val Button: Button =
            findViewById(R.id.button)

        Button.setOnClickListener{
            val intent = Intent(this,doaHarian::class.java)
            startActivity(intent)
        }

        val data = arrayListOf<Doa>(
            Doa("Doa masuk kamar mandi",R.drawable.doaharian),
            Doa("Doa terhindar dari dajjal",R.drawable.doaharian),
            Doa("Doa makan",R.drawable.doaharian),
            Doa("Doa Rezeki",R.drawable.doaharian),
            Doa("Doa masuk surga",R.drawable.doaharian),
            Doa("Doa masuk islam",R.drawable.doaharian),
            Doa("Doa masuk masjid",R.drawable.doaharian),

        )

        val adapter = DoaAdapter(data)

        Doa.adapter = adapter

        Doa.layoutManager =
            LinearLayoutManager( this,
                LinearLayoutManager.VERTICAL,false)



    }



    }

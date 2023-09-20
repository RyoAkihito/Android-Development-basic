package com.example.myprojekandriod

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojekandriod.Adapter.LanguageAdapter
import com.example.myprojekandriod.model.Doa

class ListprogramActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listprogram)
        val bahasapemrograman: RecyclerView =
            findViewById(R.id.rvbahasapemrograman)

        val data = arrayListOf<Doa>(
            Doa("Golang",R.drawable.golang),
            Doa("Python",R.drawable.python),
            Doa("Golang",R.drawable.golang),
            Doa("Golang",R.drawable.golang),
            Doa("Golang",R.drawable.golang),
            Doa("Golang",R.drawable.golang),
            Doa("Golang",R.drawable.golang),
            Doa("Golang",R.drawable.golang),
        )

        val adapter = LanguageAdapter(data)

        bahasapemrograman.adapter = adapter

        bahasapemrograman.layoutManager =
            LinearLayoutManager( this,
                LinearLayoutManager.VERTICAL,false)

    }
}
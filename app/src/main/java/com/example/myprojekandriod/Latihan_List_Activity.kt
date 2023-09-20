package com.example.myprojekandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class Latihan_List_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

        val arraybro: ArrayAdapter<*>
        val users = arrayOf(
            "Python","C#","C++","JavaScript","PHP","Swift","Java","Go","SQL","Ruby"
        )
        var alstyle : ListView = findViewById(R.id.lvnama)

        arraybro= ArrayAdapter(this, android.R.layout.simple_list_item_1,users)
        alstyle.adapter=arraybro
    }
}
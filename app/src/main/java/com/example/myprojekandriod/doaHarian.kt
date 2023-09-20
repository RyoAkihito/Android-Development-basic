package com.example.myprojekandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myprojekandriod.Adapter.DoaAdaperlagi
import com.example.myprojekandriod.model.Doa
import com.example.myprojekandriod.model.doa_harian

class doaHarian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val Doa1: RecyclerView =
            findViewById(R.id.rvdoahrian)

        val data = arrayListOf<doa_harian>(
            doa_harian("Doa masuk kamar mandi","Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi","اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ"),
            doa_harian("Doa Sebelum Makan","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ"),


            )

        val adapteri = DoaAdaperlagi(data)

        Doa1.adapter = adapteri

        Doa1.layoutManager =
            LinearLayoutManager( this,
                LinearLayoutManager.VERTICAL,false)

    }
    }

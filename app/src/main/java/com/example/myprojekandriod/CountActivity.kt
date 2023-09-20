package com.example.myprojekandriod

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.math.log

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber : TextView = findViewById(R.id.tvNumber)
        val btnCount : Button = findViewById(R.id.btnCount)
        val reset : Button = findViewById(R.id.btnreset)
        val Min : Button = findViewById(R.id.btnminus)

        var numberup : Int=0


        btnCount.setOnClickListener{

            var countinteger : Int = tvNumber.text.toString().toInt()

            numberup++

            tvNumber.text=numberup.toString()
        }


        Log.d("Number", "Hasil : ${tvNumber.text}")

        Min.setOnClickListener{

            var countinteger : Int = tvNumber.text.toString().toInt()

            numberup--

            tvNumber.text=numberup.toString()
        }


        Log.d("Number", "Hasil : ${tvNumber.text}")

        reset.setOnClickListener{

            var countinteger : Int = tvNumber.text.toString().toInt()

            numberup = 0

            tvNumber.text=numberup.toString()
        }


        Log.d("Number", "Hasil : ${tvNumber.text}")




    }
}
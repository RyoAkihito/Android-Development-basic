package com.example.myprojekandriod

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class kalkulator : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        val angka1 : EditText =  findViewById(R.id.angka1)
        val angka2 : EditText =  findViewById(R.id.angka2)

        val btntambah : Button = findViewById(R.id.tambah)
        val btnkurang : Button = findViewById(R.id.kurang)
        val btnpersen : Button = findViewById(R.id.persen)

        val btnkali : Button = findViewById(R.id.kali)
        val btbagi : Button = findViewById(R.id.bagi)
        val btnclear : Button = findViewById(R.id.clear)

        val hasil : TextView = findViewById(R.id.tvhasil)

        val Builder:AlertDialog.Builder =
            AlertDialog.Builder(this@kalkulator)



        btntambah.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1+a2

            hasil.setText(hasiltambah.toString())

        }

        btnkurang.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1-a2

            hasil.setText(hasiltambah.toString())

        }

        btnpersen.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1%a2

            hasil.setText(hasiltambah.toString())

        }

        btnkali.setOnClickListener{

            var a1 : Int = angka1.text.toString().toInt()
            var a2 : Int = angka2.text.toString().toInt()


            var hasiltambah : Int  = a1*a2

            hasil.setText(hasiltambah.toString())

        }

        btbagi.setOnClickListener{

            var a1  = angka1.text.toString().toFloat()
            var a2  = angka2.text.toString().toFloat()


            var hasiltambah   = a1 / a2

            hasil.setText(hasiltambah.toString())

        }

        btnclear.setOnClickListener{

            Builder.setTitle("perhatian")
            Builder.setMessage("Apakah kamu yakin ingin Menghapus data")
            Builder.setCancelable(false)
            Builder.setPositiveButton("Ya",DialogInterface.OnClickListener { dialog, which ->

                hasil.setText("0")
                angka1.setText("0")
                angka2.setText("0")

            })

            Builder.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialog, which ->  })
            val alertDialog:AlertDialog = Builder.create()
            Builder.setIcon(R.drawable.baseline_info_24)
            alertDialog.show()


        }





    }
}
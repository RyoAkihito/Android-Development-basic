package com.example.myprojekandriod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleHello :TextView = findViewById(R.id.titleHello)

        val labelNama : TextView = findViewById(R.id.labelNama)
        val Inputnama : EditText = findViewById(R.id.inputNama)

        val Labelkelas : TextView = findViewById(R.id.lebelKelas)
        val Inputkelas : EditText = findViewById(R.id.inputKelas)

        val btnSubmit : Button = findViewById(R.id.btnSubmit)

        val nama : TextView = findViewById(R.id.namaPrint)
        val kelas : TextView = findViewById(R.id.kelasPrint)

        titleHello.text = "Form Biodata"

        btnSubmit.setOnClickListener{
            Toast.makeText(this,"Hello ${Inputnama.editableText}",
                Toast.LENGTH_SHORT

            ).show()

            nama.text=Inputnama.text
            kelas.text=Inputkelas.text
        }




    }
}
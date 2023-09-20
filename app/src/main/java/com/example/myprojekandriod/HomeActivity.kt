package com.example.myprojekandriod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call.Details
import android.widget.Button
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val btnpindah : Button = findViewById(R.id.btnpindah)
        val btnshare : MaterialButton = findViewById(R.id.btnshare)

        btnpindah.setOnClickListener{


            val intent = Intent(this,detailActivity::class.java)

            startActivity(intent)
        }

        btnshare.setOnClickListener{

            val intent = Intent(Intent.ACTION_SEND)

            intent.putExtra(Intent.EXTRA_TEXT,"Hello saya share ke sosial media ya")
            intent.setType("text/plain")

            startActivity(Intent.createChooser(intent,"Share TO"))
        }

    }
}
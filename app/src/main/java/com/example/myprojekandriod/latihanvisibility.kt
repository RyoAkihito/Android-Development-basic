package com.example.myprojekandriod

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class latihanvisibility : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihanvisibility)

        val tvtext : TextView = findViewById(R.id.twxt)
        val tvbtn : Button = findViewById(R.id.bton)

        tvbtn.setOnClickListener{
            if(tvtext.visibility == View.VISIBLE) {
                tvtext.visibility = View.INVISIBLE
            } else {
                tvtext.visibility = View.VISIBLE
            }
        }





    }


}
package com.example.myprojekandriod

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class TravelActivity : AppCompatActivity() {

    var ibcall : ImageButton? = null
    var IbRoute : ImageButton? = null
    var IbShare : ImageButton? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibcall = findViewById(R.id.Ibcall)
        IbRoute = findViewById(R.id.ibRoute)
        IbShare = findViewById(R.id.ibShare)

        ibcall?.setOnClickListener{

            val number = "344536578"
            val intent = Intent(Intent.ACTION_DIAL ,Uri.parse("tel: $number"))


            startActivity(intent)
        }

        IbRoute?.setOnClickListener {
            val mapintent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:48.86379456010426, 2.294846291157996"))


            mapintent.setPackage("com.google.android.apps.maps")
            startActivity(mapintent)
        }




























    }
}
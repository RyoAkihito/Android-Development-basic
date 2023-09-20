package com.example.myprojekandriod

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class Bukakamera : AppCompatActivity() {
    var ibkamera:ImageButton?=null
    var ivsample:ImageView?=null
    val pic_id: Int = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bukakamera)

        ibkamera = findViewById(R.id.btnKamera)
        ivsample = findViewById(R.id.ivsample)


        ibkamera!!.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == pic_id){

            val photo:Bitmap =data?.extras?.get("data")as Bitmap

            ivsample!!.setImageBitmap(photo)
        }
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_bukakamera)
//
//
//    }
}

//class openkamera : AppCompatActivity(){
//
//
//
//}
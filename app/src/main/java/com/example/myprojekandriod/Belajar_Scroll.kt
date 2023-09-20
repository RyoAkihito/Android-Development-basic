package com.example.myprojekandriod

import android.annotation.SuppressLint
import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation


class Belajar_Scroll : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {

        var bga : ImageView? = null


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll)

        bga = findViewById(R.id.blur)

        Glide.with(this)
            .load(R.drawable.to_me_the_one_who_love_you)
            .transform(BlurTransformation(7,3))
            .into(bga)






    }
}
package com.example.projectakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailFootballActivity : AppCompatActivity() {

    companion object {
        const val FOOTBALL_NAME = "football_name"
        const val FOOTBALL_DESCRIPTION = "football_description"
        const val FOOTBALL_IMAGE = "football_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_football)

        val name = intent.getStringExtra(FOOTBALL_NAME)
        val tvFootballName : TextView= findViewById(R.id.tv_item_name)
        tvFootballName.text = name

        val detail = intent.getStringExtra(FOOTBALL_DESCRIPTION)
        val tvFootballDetail : TextView = findViewById(R.id.tv_item_detail)
        tvFootballDetail.text = detail

        val image = intent.getIntExtra(FOOTBALL_IMAGE, 0)
        val imgFootball : ImageView = findViewById(R.id.img_item_photo)
        imgFootball.setImageResource(image)

        this.setTitle(name)
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);

    }
}
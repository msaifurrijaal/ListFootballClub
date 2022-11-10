package com.example.projectakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_profil)

        setTitle("My Profile")
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
    }
}
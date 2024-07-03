package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.SearchView




class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val imageView15 = findViewById<ImageView>(R.id.imageView15)

        imageView15.setOnClickListener {
            val intent = Intent(this, Vr_desc::class.java)
            startActivity(intent)
        }

        val imageView16 = findViewById<ImageView>(R.id.imageView16)

        imageView16.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        val imageView11 = findViewById<ImageView>(R.id.imageView11)

        imageView11.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
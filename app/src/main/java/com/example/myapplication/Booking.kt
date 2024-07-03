package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Booking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val imageView42 = findViewById<ImageView>(R.id.imageView42)

        imageView42.setOnClickListener {
            val intent = Intent(this, Vr_desc::class.java)
            startActivity(intent)
        }
    }
}
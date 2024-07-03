package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Vr_desc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vr_desc)

        val imageView25 = findViewById<ImageView>(R.id.imageView25)

        imageView25.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        val button3: Button = findViewById(R.id.button3)

        button3.setOnClickListener {
            startActivity(Intent(this, Booking::class.java))

        }


    }
}
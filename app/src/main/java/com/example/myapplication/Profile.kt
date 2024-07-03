package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val imageView38 = findViewById<ImageView>(R.id.imageView38)

        imageView38.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        val textView41 = findViewById<TextView>(R.id.textView41)

        textView41.setOnClickListener {
            val intent = Intent(this, Onbord3::class.java)
            startActivity(intent)
        }
    }
}
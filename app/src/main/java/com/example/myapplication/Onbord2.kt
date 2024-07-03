package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onbord2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_2)

        val button: Button = findViewById(R.id.button4)

        button.setOnClickListener {
            startActivity(Intent(this, Onbord3::class.java))

        }
    }
}
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class Onbord1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_1)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            startActivity(Intent(this, Onbord2::class.java))
        }
    }
}
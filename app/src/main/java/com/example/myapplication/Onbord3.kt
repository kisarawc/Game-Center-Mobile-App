package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Onbord3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onbord_3)

        val button: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))

        }


    }
}
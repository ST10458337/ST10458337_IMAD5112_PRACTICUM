package com.example.st10458337_imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStarted = findViewById<Button>(R.id.btnSplashContinue)

        getStarted.setOnClickListener { 
            val next = Intent(this, mainScreen::class.java)
            startActivity(next)
        }
    }
}
package com.example.st10458337_imad5112_practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStarted = findViewById<Button>(R.id.btnSplashContinue)
        val closeSplash = findViewById<Button>(R.id.btnSplashExit)

        getStarted.setOnClickListener {
            val next = Intent(this, MainScreen::class.java)
            startActivity(next)
        }
        closeSplash.setOnClickListener {
            exitProcess(0)
        }
    }
}
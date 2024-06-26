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

        val getStarted = findViewById<Button>(R.id.btnSplashContinue) // Declaring a variable for the continue button
        val closeSplash = findViewById<Button>(R.id.btnSplashExit)

        getStarted.setOnClickListener {
            val nextPage1 = Intent(this, MainScreen::class.java)
            startActivity(nextPage1) // on click event the user will be transitioned to the main screen
        }
        closeSplash.setOnClickListener {
            exitProcess(0)
        }
    }
}
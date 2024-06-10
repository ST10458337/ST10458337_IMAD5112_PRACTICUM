package com.example.st10458337_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainScreen : AppCompatActivity() {
    private lateinit var calcAverage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)

        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val temperature = arrayOf(Int)
    }
}
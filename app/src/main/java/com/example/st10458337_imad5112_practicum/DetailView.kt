package com.example.st10458337_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class DetailView : AppCompatActivity() {

    private val days = arrayOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val weatherConditions = arrayOf<String>("Sunny", "Sunny", "Sunny", "Sunny", "Cloudy","Raining","Cold")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailview)

        val results = findViewById<TextView>(R.id.txtDetails)

        results.text = "$days" + "$weatherConditions"


        val backToMain = findViewById<Button>(R.id.btnBackToMain)

        backToMain.setOnClickListener {
            exitProcess(0)
        }
    }
}
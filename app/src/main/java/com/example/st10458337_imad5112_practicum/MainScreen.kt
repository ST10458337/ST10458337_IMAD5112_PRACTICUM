package com.example.st10458337_imad5112_practicum

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainScreen : AppCompatActivity() {
    private lateinit var calcAverage: Button
    val days = arrayOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val minTemp = arrayOf(7)
    val maxTemp = arrayOf(7)
    var totalTemp = 0
    var avgTemp = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)

        val moveToDetail = findViewById<Button>(R.id.btnNext)
        val exitMain = findViewById<Button>(R.id.btnExitMain)

        moveToDetail.setOnClickListener {
            val nextPage2 = Intent(this, DetailView::class.java)
            startActivity(nextPage2)
        }

        calcAverage = findViewById(R.id.btnAverage)

        val averageAndDays = findViewById<TextView>(R.id.txtDisplay)

        calcAverage.setOnClickListener {
            averageTemperature()
            averageAndDays.text = "$days" + "${averageTemperature()}"
        }

        exitMain.setOnClickListener {
            exitProcess(0)
        }

    }
    private fun averageTemperature(){
        while (totalTemp == minTemp.size)
        {
            avgTemp = totalTemp / 7
        }
        while (totalTemp == maxTemp.size){
            avgTemp = totalTemp / 7
        }
        }

    }

package com.example.st10458337_imad5112_practicum

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class DetailView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailview)

        val backToMain = findViewById<Button>(R.id.btnBackToMain)

        backToMain.setOnClickListener {
            exitProcess(0)
        }
    }
}
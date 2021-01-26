package com.utilities.kotconvui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val m2KM = 1.6
        val input: TextView = findViewById(R.id.miglia_da_convertire_editText)
        val output: TextView = findViewById(R.id.chilometri_corrispondenti_textView)
        val button : Button = findViewById(R.id.converti_button)
        button.setOnClickListener {
            val milesToConvert = input.text.toString().toDouble()
            val result = milesToConvert * m2KM
            output.text = result.toString()
        }



    }
}
package com.example.temperature_converter_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextTemperature: EditText
    private lateinit var buttonToFahrenheit: Button
    private lateinit var buttonToCelsius: Button
    private lateinit var textViewResult: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hilangkan Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar()?.hide();
        }

        editTextTemperature = findViewById(R.id.editTextTemperature)
        buttonToFahrenheit = findViewById(R.id.buttonToFahrenheit)
        buttonToCelsius = findViewById(R.id.buttonToCelsius)
        textViewResult = findViewById(R.id.textViewResult)

        buttonToFahrenheit.setOnClickListener {
            convertToFahrenheit()
        }

        buttonToCelsius.setOnClickListener {
            convertToCelsius()
        }
    }

    private fun convertToFahrenheit() {
        val celsiusString = editTextTemperature.text.toString()
        if (celsiusString.isNotEmpty()) {
            val celsius = celsiusString.toDouble()
            val fahrenheit = (celsius * 9 / 5) + 32
            textViewResult.text = String.format("%.2f °F", fahrenheit)
        } else {
            textViewResult.text = "Please enter a temperature."
        }
    }

    private fun convertToCelsius() {
        val fahrenheitString = editTextTemperature.text.toString()
        if (fahrenheitString.isNotEmpty()) {
            val fahrenheit = fahrenheitString.toDouble()
            val celsius = (fahrenheit - 32) * 5 / 9
            textViewResult.text = String.format("%.2f °C", celsius)
        } else {
            textViewResult.text = "Please enter a temperature."
        }
    }
}

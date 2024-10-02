package com.example.temperature_converter_app

class TemperatureConverter {
    companion object {
        fun convertToFahrenheit(celsius: Double): Double {
            return (celsius * 9 / 5) + 32
        }

        fun convertToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }
    }
}
package fes.aragon.androidmaster.exercises

// En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

// En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

// De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
// Kelvin a Celsius: °C = K - 273.15
// De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
// Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para convertir un número en un tipo String con 2 decimales.

fun main() {
    // Fill in the code.
    val celcius=27.0
    var farenheit = celciusToFarenheit(celcius)
    //printFinalTemperature(celcius, "Celcius", "Farenheit", )
}

fun celciusToFarenheit(celcius:Double):Double{
    return ((9/5)*(celcius)+32).toDouble()
}
fun kelvinToCelcius(kelvin:Double):Double{
    return (kelvin - 273.15).toDouble()
}
fun farenheitToKelvin(farenheit: Double):Double{
    return ((5f/9f)*(farenheit - 32)+273.15).toDouble()
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

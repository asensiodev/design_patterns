package org.asensiodev

import org.asensiodev.display.CurrentConditionsDisplay
import org.asensiodev.display.ForecastConditionDisplay
import org.asensiodev.display.HeatIndexDisplay
import org.asensiodev.display.StatisticsDisplay
import org.asensiodev.observer.WeatherData

fun main() {
    val weatherData = WeatherData()
    val currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastConditionDisplay = ForecastConditionDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(temperature = 80f, humidity = 65f, pressure = 30.4f)
    weatherData.setMeasurements(temperature = 82f, humidity = 70f, pressure = 29.2f)
    weatherData.setMeasurements(temperature = 78f, humidity = 90f, pressure = 29.2f)
}

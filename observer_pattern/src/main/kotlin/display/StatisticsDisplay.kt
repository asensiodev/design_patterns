package org.asensiodev.display

import org.asensiodev.observer.Observer
import org.asensiodev.observer.WeatherData

class StatisticsDisplay(private var weatherData: WeatherData) : Observer, DisplayElement {

    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        val temp = weatherData.getTemperature()
        tempSum += temp
        numReadings++

        if (temp > maxTemp) {
            maxTemp = temp
        }

        if (temp < minTemp) {
            minTemp = temp
        }

        display()
    }

    override fun display() {
        println(
            "Avg/Max/Min temperature = " + (tempSum / numReadings)
                    + "/" + maxTemp + "/" + minTemp
        )
    }

}
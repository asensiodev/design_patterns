package org.asensiodev.display

import org.asensiodev.observer.Observer
import org.asensiodev.observer.WeatherData

class CurrentConditionsDisplay(private var weatherData: WeatherData) : Observer, DisplayElement {

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        this.temperature = weatherData.getTemperature()
        this.humidity = weatherData.getPressure()
        display()
    }

    override fun display() {
        println("Current conditions: ${temperature}F degrees and $humidity humidity")
    }

}
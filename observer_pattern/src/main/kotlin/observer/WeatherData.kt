package org.asensiodev.observer

import org.asensiodev.subject.Subject

class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        observers.forEach { observer ->
            observer.update()
        }
    }

    fun measurementChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementChanged()
    }

    fun getTemperature() = temperature
    fun getHumidity() = humidity
    fun getPressure() = pressure

}
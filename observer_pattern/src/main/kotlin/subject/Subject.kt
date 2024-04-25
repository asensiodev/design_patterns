package org.asensiodev.subject

import org.asensiodev.observer.Observer

interface Subject {
    fun registerObserver(o: Observer)
    fun removeObserver(o: Observer)
    fun notifyObservers()
}
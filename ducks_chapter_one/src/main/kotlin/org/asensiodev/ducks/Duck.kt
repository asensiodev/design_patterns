package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_interfaces.FlyBehaviour
import org.asensiodev.org.asensiodev.behaviour_interfaces.QuackBehaviour

abstract class Duck(
    val flyBehaviour: FlyBehaviour? = null,
    val quackBehaviour: QuackBehaviour? = null
) {

    abstract fun display()

    fun performFly() {
        flyBehaviour?.fly()
    }

    fun performQuack() {
        quackBehaviour?.quack()
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

}
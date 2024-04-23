package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_interfaces.FlyBehaviour
import org.asensiodev.org.asensiodev.behaviour_interfaces.QuackBehaviour

abstract class Duck(
    var flyBehaviour: FlyBehaviour? = null,
    var quackBehaviour: QuackBehaviour? = null
) {

    fun swim() {
        println("All ducks float, even decoys!")
    }

    abstract fun display()

    fun performFly() {
        flyBehaviour?.fly()
    }

    fun performQuack() {
        quackBehaviour?.quack()
    }

    fun updateFlyBehaviour(fb: FlyBehaviour) {
        flyBehaviour = fb
    }

    fun updateQuackBehaviour(qb: QuackBehaviour) {
        quackBehaviour = qb
    }

}
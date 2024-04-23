package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_implementations.FlyNoWay
import org.asensiodev.org.asensiodev.behaviour_interfaces.quack_implementations.Quack

class ModelDuck : Duck(
    flyBehaviour = FlyNoWay(),
    quackBehaviour = Quack()
) {
    override fun display() {
        println("I'm a model duck!")
    }
}
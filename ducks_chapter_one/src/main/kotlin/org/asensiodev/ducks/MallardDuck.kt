package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_implementations.FlyWithWings
import org.asensiodev.org.asensiodev.behaviour_interfaces.quack_implementations.Quack

class MallardDuck : Duck(
    quackBehaviour = Quack(),
    flyBehaviour = FlyWithWings()
) {

    override fun display() {
        println("I'm a real Mallard duck")
    }

}
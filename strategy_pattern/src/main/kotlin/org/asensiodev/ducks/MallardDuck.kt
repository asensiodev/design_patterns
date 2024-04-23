package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_implementations.FlyWithWings
import org.asensiodev.org.asensiodev.behaviour_interfaces.quack_implementations.Quack

class MallardDuck : Duck(
    flyBehaviour = FlyWithWings(),
    quackBehaviour = Quack()
) {

    override fun display() {
        println("I'm a real Mallard duck")
    }

}
package org.asensiodev.org.asensiodev.behaviour_implementations

import org.asensiodev.org.asensiodev.behaviour_interfaces.FlyBehaviour

class FlyNoWay: FlyBehaviour {
    override fun fly() {
        println("I can't fly!!")
    }
}
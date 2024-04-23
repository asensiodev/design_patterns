package org.asensiodev.org.asensiodev.behaviour_interfaces.fly_implementations

import org.asensiodev.org.asensiodev.behaviour_interfaces.FlyBehaviour

class FlyRocketPowered : FlyBehaviour {
    override fun fly() {
        println("I'm flying with a rocket!!")
    }
}
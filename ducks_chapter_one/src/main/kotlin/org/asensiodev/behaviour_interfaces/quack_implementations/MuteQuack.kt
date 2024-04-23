package org.asensiodev.org.asensiodev.behaviour_interfaces.quack_implementations

import org.asensiodev.org.asensiodev.behaviour_interfaces.QuackBehaviour

class MuteQuack : QuackBehaviour {
    override fun quack() {
        println("<<Silence>>")
    }
}
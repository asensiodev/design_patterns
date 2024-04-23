package org.asensiodev.org.asensiodev.ducks

import org.asensiodev.org.asensiodev.behaviour_interfaces.QuackBehaviour

class DuckCall(
    var quackBehaviour: QuackBehaviour
) {
    fun makeQuackSound() {
        quackBehaviour.quack()
    }
}
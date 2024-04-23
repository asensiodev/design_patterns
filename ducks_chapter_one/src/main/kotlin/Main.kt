package org.asensiodev

import org.asensiodev.org.asensiodev.behaviour_interfaces.fly_implementations.FlyRocketPowered
import org.asensiodev.org.asensiodev.ducks.Duck
import org.asensiodev.org.asensiodev.ducks.MallardDuck
import org.asensiodev.org.asensiodev.ducks.ModelDuck

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    println("============")

    val model: Duck = ModelDuck()
    model.performFly()
    model.updateFlyBehaviour(FlyRocketPowered())
    model.performFly()

}
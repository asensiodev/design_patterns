package org.asensiodev

import org.asensiodev.org.asensiodev.ducks.Duck
import org.asensiodev.org.asensiodev.ducks.MallardDuck

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()
}
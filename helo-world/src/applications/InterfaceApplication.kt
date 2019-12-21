package main.applications

import main.models.Bat

fun main() {
    val bat: Bat = Bat()
    bat.eat()
    bat.walk()
    bat.fly()
    bat.getAgeOfBat()
    bat.setAgeOfBat(25)
    bat.getAgeOfBat()
}
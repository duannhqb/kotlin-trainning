package main.models

import main.interfaces.Animal
import main.interfaces.Bird

class Bat : Animal, Bird {

    override var age: Int = 20

    override fun walk() {
//        super.walk()
        println("I'm a Bat, I can walk.")
    }

    override fun eat() {
//        super<Animal>.eat()
//        super<Bird>.eat()
        println("I'm a Bat, I can eat everything in anywhere at anytime.")
    }

    override fun fly() {
//        super.fly()
        println("I'm a Bat, I can fly.")
    }

    fun setAgeOfBat(age: Int) {
        this.age = age
    }

    fun getAgeOfBat() {
        println("Age is ${this.age}")
    }

}
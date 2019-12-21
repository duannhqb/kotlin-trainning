package main

fun main(args: Array<String>) {
    val person = Person("Duan", "Ngo Huu", 1)

    println("My name is ${person.firstName} ${person.lastName}${person.checkGender()} ")
}

//class Person constructor(
//    val firstName: String,
//    val lastName: String,
//    var gender: Int?
//)

class Person(val firstName: String, val lastName: String, var gender: Int? = null) {
    init {
        println(">>>>>>>>>>>>>>> just init")
    }

    private var result: String = ", gender is "

    fun checkGender(): String {
        if (gender === null) {
            return ""
        }

        if (gender == 1) {
            result += "male"
        } else {
            result += "female"
        }

        return result
    }
}
package main

fun main() {
    val people = People("Duan", "Ngo Huu")
    people.getName()

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

    val student = Student("Developer", "Duan", "Ngo Huu")
    student.getName()
    student.getCategory()
    student.getMyInfo()
    student.getAllAfterChange()
}

open class People(protected open val firstName: String, protected open val lastName: String) {
    open fun getName() {
        println("My name is $lastName $firstName")
    }
}

class Student(private val job: String, firstName: String, lastName: String) : People(firstName, lastName) {
    override val firstName = super.firstName.toUpperCase();
    override val lastName = super.lastName.toUpperCase();

    override fun getName() {
        println("Please call method 'getMyInfo' to show this info")
    }

    fun getCategory() {
        println("My job is $job")
    }

    fun getMyInfo() {
        super.getName();
        println("My name is ${super.lastName} ${super.firstName}, my job is ${job.toUpperCase()}")
    }

    fun getAllAfterChange() {
        println("My name has changed from ${super.lastName} ${super.firstName} to ${this.lastName} ${this.firstName}")
        println("and my job not change, still is ${this.job}")
    }
}
package main.applications

fun main(args: Array<String>) {
    var variable: String = "hihi"
    val value: String = "kkkkkkk"
    variable = "kaka"
    println("Hello World $variable kakakak $value")

    var number1: Long = 1_000L
    println("number1 = $number1")

    var hihi: Double?

    hihi = null

    println("hihi = $hihi")

    println("hihi = ${number1.toString()}")
    println("hihi = ${number1.toDouble()}")
    println("hihi = ${number1.toFloat()}")

    var a: Double = 0.0
    var b = 1.0;
    if (a == b) {
        println("A equal B ? ${a == b}")
    } else println("A equal B ? ${a == b}")

    val arr1: Array<String> = arrayOf("a", "b", "c")

    for (a in arr1) {
        println("a = $a")
    }

    var c: Char = 'a'
    var resultWhen: String = when (c) {
        'a' -> "aaaaaaaaaaaaaaaaaaa"
        'b' -> "bbbbbbbbbbbbbbbbbbbbb"
        else -> "nooooooooooooooooo"
    }

    println(resultWhen)

    var b2: Int = 1
    val resultB: String = when (b2) {
        1 -> "1 is number chosen"
        2 -> "2 is number chosen"
        else -> "no number chosen"
    }

    println(resultB)

    var ggg: Boolean = false
    if (ggg) {
        println(">>>>>>>>>>>>>>>>>>> $ggg")
    }

    fun checkNum(inputNumber: Number) = when (inputNumber) {
        0 -> println("0000000000000000")
        1 -> println("1111111111111111")
        2, 3 -> println(">>>>>>>>>>>>>>>>>>> 2 or 3")
        in 3..99 -> println("> 3 and < 99")
        else -> println("elseeeeeeeeeeeeeeeeeeee")
    }

    checkNum(0)
    checkNum(1)
    checkNum(3)
    checkNum(88)
    checkNum(100)

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
//    for
    val intNumbers: Array<Int> = arrayOf(11, 12, 13)
    for (number in intNumbers) {
        println("number = $number")
    }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
//    for i
    for (index in intNumbers.indices) {
        println("value at index = $index is ${intNumbers[index]}")
    }

    println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
//    for i has value
    for ((index, value) in intNumbers.withIndex()) {
        println("index = $index and value = $value")
    }
}
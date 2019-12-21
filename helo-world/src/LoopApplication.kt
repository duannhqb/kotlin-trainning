package main

fun main(args: Array<String>) {
    val ints: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7)
    for (int: Int in ints) {
        if (int == 3) {
//            break;
            continue;
        }
        println("value is $int")
    }

    labelHi@ for (i in 1..100) {
        label2@ for (j in 1..100) {
            if (i >= 20 && j >= 20) {
                break@labelHi
            }
            println("i = $i, j = $j")
        }
    }

    fun prinIntLists(intNumbers: Array<Int>) {
        intNumbers.forEach {
            if (it === 7) return
            println("item = $it")
        }
    }

    prinIntLists(ints)
}
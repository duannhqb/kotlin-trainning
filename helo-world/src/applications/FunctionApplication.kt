package main.applications

fun main(args: Array<String>) {
    println(addTwoInts1(1, 2))
    println(addTwoInts1(1))

    println(addTwoInts2(1))
    println(addTwoInts2(2, 3))

    println(addTwoInts3(1, 2))

    println(addTwoInts3(5))

    addTwoIntsAndPrint1(1, 2)
    addTwoIntsAndPrint2(5)
    addTwoIntsAndPrint3(6)
    addTwoIntsAndPrint4(8)
    addTwoIntsAndPrint5()

    varargFunc(1, 2, 3)
    varargFunc(1, 2)
    varargFunc(1)
    varargFunc()

    println("5 + 5 = ${5 plussss 5}")

    println("factorial 5! = ${factorial(5)}")
}

fun addTwoInts1(a: Int, b: Int = 1): Int = a + b

fun addTwoInts2(a: Int, b: Int = 1): Int {
    return a + b
}

fun addTwoInts3(a: Int, b: Int = a): Int = a * b

fun addTwoIntsAndPrint1(a: Int, b: Int = a) {
    println("a + b = ${a + b}")
}

// Unit = void (java)
fun addTwoIntsAndPrint2(a: Int, b: Int = a): Unit {
    println("a + b = ${a * b}")
}

fun addTwoIntsAndPrint3(a: Int, b: Int = a): Unit = println("value is ${a + b}")

fun addTwoIntsAndPrint4(a: Int, b: Int = a) = println("value is ${a + b}")

fun addTwoIntsAndPrint5() = println("value is ${5 + 5}")

fun varargFunc(vararg args: Int) {
    if (args.isEmpty()) {
        println("This function is empty")
        return
    }

    for (item in args) {
        println("Value of item = $item")
    }
}

infix fun Int.plussss(x: Int): Int = this + x // this = Int, x = x

// tailrec hàm đệ quy ( gọi liên tục lồng nhau k thoát đc, cái này sẽ hỗ trợ thoát để k bị treo loop )
// tính giai thừa: n! => 5! = 1*2*3*4*5
// result = n! = ...(n - (n - (n - (n - 1))))*(n - (n - (n - 1)))*(n - (n - 1))*(n - 1) * n
tailrec fun factorial(n: Long = 1): Long {
    if (n == 1L) return 1
    return n * factorial(n - 1)
}
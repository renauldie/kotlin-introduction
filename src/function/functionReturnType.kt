package function

fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

fun bagi(a: Int, b: Int): Int {
    if (a == 0 ||  b == 0) {
        return 0
    } else {
        return a / b
    }
}


fun main() {
    println(jumlahkan(10, 10))
    println(jumlahkan(100, 100))
    val result = jumlahkan(200, 200)
    println(result)

    val result2 = jumlahkan(5, 5)
    println(result2)

    println("hasil:  ${bagi(100, 10)}")
    println("hasil: ${bagi(100, 0)}")
}
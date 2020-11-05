package lambda

fun String.hitung(){
    println("Perhitungan $this")
}

fun Int.bagi(a: Int) : Int {
    return this/a
}

fun main() {
    val operator = "Bagi"

    operator.hitung()
    println(50.bagi(2))

    "Pembagian".hitung()
    println(30.bagi(2))

}
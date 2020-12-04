package oop.classIntro

class Kalkulator(n1: Int, n2: Int) {

    var point1: Int
    var point2: Int

    init {
        point1 = n1
        point2 = n2
        fun tambah(): Int {
            return point1 + point2
        }

        fun kurang(): Int {
            return point1 - point2
        }

        fun kali(): Int {
            return point1 * point2
        }

        fun bagi() : Int{
           return point1 / point2
        }

        var hasil = 0

        println("Hasil Penjumlahan adalah : ${tambah()}")
        println("Hasil Pengurangan adalah : ${kurang()}")
        println("Hasil Perkalian adalah : ${kali()}")
        println("Hasil Pembagian adalah : ${bagi()}")
    }

    fun print() {
    }

}

fun main() {
    val operator = Kalkulator(10, 2)
}
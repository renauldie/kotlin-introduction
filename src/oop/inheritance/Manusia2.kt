package oop.inheritance

open class Manusia2 {
    open fun tampilUmur(umur:Int) {
        println("Umur saya $umur tahun")
    }
}

class Dosen2: Manusia2() {
    override fun tampilUmur(umur: Int) {
        println("Umur saya pada 5 tahun yag lalu dalah ${umur -5} tahun")
    }
}

fun main() {
    val dosen = Dosen2()
    dosen.tampilUmur(32)
}
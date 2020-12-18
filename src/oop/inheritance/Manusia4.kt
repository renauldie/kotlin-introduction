package oop.inheritance

open class Manusia4 {
    open fun tampilUmur(umur: Int ) {
        println("Umur saya $umur Tahun")
    }
}

class Dosen4 : Manusia4() {
    override  fun tampilUmur(umur: Int) {
        super.tampilUmur(umur)
        println("Umur saya pada 5 ahun yang alu adalah ${umur - 5}")
    }
}

fun main() {
    val dosen = Dosen4 ()
    dosen.tampilUmur(31)
}
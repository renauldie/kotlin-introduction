package oop.inheritance

open class Manusia1(nama: String, umur: Int) {

}

class Dosen1 (nama:String, umur: Int, kampus:String) : Manusia1(nama, umur) {
    init {
        println("Nama saya $nama saya berumur $umur dan mengajar di $kampus ")
    }

    fun mengajar( ) {
        println("Saya bekerja sebagai dosen")
    }

}

fun main() {
    val dosen = Dosen1("Budy", 25, "Universitas Amikom Yogyakarta")
}
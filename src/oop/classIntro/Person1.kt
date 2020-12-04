package oop.classIntro

class Person1(pNama:String, pUmur: Int) {
    val nama: String
    var umur: Int

    init {
        nama = pNama.capitalize()
        umur = pUmur

        println("Nama= $nama")
        println("Umur=$umur")
    }
}

fun main() {
    val person = Person1("Bambang", 33)

}
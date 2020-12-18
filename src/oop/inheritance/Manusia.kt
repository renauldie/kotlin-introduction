package oop.inheritance

open class Manusia(umur: Int, nama:String) {
    init {
        println("Nama saya adalah: $nama")
        println("Umur saya: $umur")
    }
}

class Atlet(umur: Int, nama: String): Manusia(umur, nama) {
    fun olahraga(){
        println("Saya adalah atlet basket.")
    }
}
class Guru(umur: Int, nama: String): Manusia(umur, nama) {
    fun mengajar(){
        println("Saya adalah guru bahasa inggris.")
    }
}

class Pedagang(umur: Int, nama: String):Manusia(umur, nama) {
    fun berjualan(){
       println("Saya berjualan sembako")
    }
}

fun main() {
    val gr = Guru(30, "Heru")
    gr.mengajar()
    println()

    val at = Atlet(32, "Surip")
    at.olahraga()
    println()

    val pd = Pedagang(55, "Karto")
    at.olahraga()
    println()
}
package oop.inheritance

interface Identitas {
    val nama: String
    fun perkenalan(nama: String)
}

class Satu(override val nama:String): Identitas {
    override fun perkenalan(nama: String) {
        println("hai $nama, namaku ${this.nama}")
    }
}

fun main() {
    val b = Satu("Rew")
    b.perkenalan("Nisa")
}
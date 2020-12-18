package oop.plymorphysm

class Mahasiswa(val NIM: String) {

    fun Belajar() {
        println("Tugas mahasiswa adalah belajar")
    }
}

fun main() {
    val mhs = Mahasiswa("18.12.0646")
    println(mhs.NIM)
    println(mhs.Belajar())
}
package oop.plymorphysm

open class MahasiswaPrivate(private val NIM: String) {
    val nomer = 34

    fun Belajar() {
        println("Tugas mahasiswa adaalha belajar $nomer")
    }

}

fun main() {

    val mhs = MahasiswaPrivate("18.12.0646")
//        println(mhs.NIM)
    println(mhs.Belajar())
}

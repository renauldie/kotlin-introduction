package oop.`interface`

interface Mahasiswa1 {
    val nama: String
        get() = "Budi"
}

class ImplementMahasiswa1: Mahasiswa1{

}

fun main() {
    val obj = ImplementMahasiswa1()

    println(obj.nama)
}
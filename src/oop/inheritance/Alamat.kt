package oop.inheritance

abstract class Alamat(val nama: String)
class Dusun(nama: String) : Alamat(nama)

class Kecamatan(nama: String) : Alamat(nama)

fun main() {
    val kec = Kecamatan("Concat")
    val des = Dusun("Depok")

    println("Desa: ${des.nama}")
    println("Kecamatan: ${kec.nama}")
}

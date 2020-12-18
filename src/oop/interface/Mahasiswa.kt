package oop.`interface`

interface Mahasiswa {
    val nama: String
    val umur: Int

    fun tampilNama(): String
    fun tampilUmur()
}

class ImplementMahasiswa: Mahasiswa {
    override val nama: String = "Budi"
    override val umur: Int = 20
    override fun tampilNama() = "Budi Sambudi"
    override fun tampilUmur() {

    }
}

fun main() {
    val obj = ImplementMahasiswa()

    println("Nama = ${obj.nama}")
    println("Umur = ${obj.umur}")

    print("Nama lengkap adalah ")
    println(obj.tampilNama())

    println("Umur anda adalah ")
    print(obj.tampilUmur())
}

package oop.classIntro

class Mahasiswa {
    private var nama:Boolean = false

    fun pinjamBuku() {
        nama = true
    }

    fun kembalikanBuku() {
        nama = false
    }

    fun status(mahasiswa: String) {
        if (nama == true)
            print("$mahasiswa meminjam buku")
        else
            print("$mahasiswa meminjam buku")
    }

}

fun main() {
    val Budi = Mahasiswa();
    val Toni = Mahasiswa();

    Budi.pinjamBuku()
    println()
    Toni.kembalikanBuku()

    Budi.status("Budi")
    Toni.status("Toni")
}

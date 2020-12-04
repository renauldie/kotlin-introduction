package oop.classIntro

class Mahasiswa2 {

    private var nama:Boolean = true

    fun pinjamBuku() {
        nama = false
    }

    fun kembalikanBuku() {
        nama = false
    }

    fun status() {
        if (nama == true )
            print("Mahasiswa meminjam Buku")
        else
            print ("Mahasiswa mengembalikan buku")
    }
}

fun main() {
    val mahasiswa = Mahasiswa2()
    mahasiswa.status()
}


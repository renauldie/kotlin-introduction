package oop.plymorphysm

class latihanPenggahian {

    val sppTetap = 1_200_000
    val sppVariable = 100_000

    fun BiayaMahasiswa(sks: Int, sppStudi: Int) {
        var total = sppTetap + (sks * sppVariable) + sppStudi
        println("Spp Mahasiswa Internasional adalah : $total")
    }

    fun BiayaMahasiswa(sks: Int) {
        var total = sppTetap + (sks * sppVariable)
        println("Spp Mahasiswa Reguler adalah       : $total")
    }

}


fun main() {
    val bm = latihanPenggahian()

    bm.BiayaMahasiswa(24)

    var inter = bm.BiayaMahasiswa(24, 4_000_000)
}
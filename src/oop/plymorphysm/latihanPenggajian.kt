package oop.plymorphysm

class latihanPenggajian {

    private val sppTetap = 1_200_000
    private val sppVariable = 100_000

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
    val bm = latihanPenggajian()

    bm.BiayaMahasiswa(24)
    bm.BiayaMahasiswa(24, 4_000_000)
}
//081334644495
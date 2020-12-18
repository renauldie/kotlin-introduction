package oop.`interface`

interface Penggajian {
    val presensi: Int
        get() = 100_000
    val tAnak: Int
        get() = 200_000
    val lembur: Int
        get() = 50_000
}

class HitungGaji(var pres: Int, var ank: Int, var lem: Int): Penggajian{
    override val presensi: Int
        get() = super<Penggajian>.presensi * pres
    override val tAnak: Int
        get() = super<Penggajian>.tAnak * ank
    override val lembur: Int
        get() = super.lembur * lem

    fun hitung() {
        println("Gaji adalah: ${presensi + tAnak + lembur}")
    }
}

fun main() {
    val pegawai = HitungGaji(10, 2, 9)
    pegawai.hitung()
    val pegawai1 = HitungGaji(5, 2, 10)
    pegawai1.hitung()
}

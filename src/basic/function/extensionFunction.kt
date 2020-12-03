package function

import java.util.*

fun main() {
    val insert = Scanner(System.`in`)

    print("Masukkan gaji tetap  : ")
    val gaji = readLine()?.toInt()
    print("Masukkan jml anak    : ")
    val anak = readLine()?.toInt()

    val gaji1 = anak!!.tunjanganAnak(gaji!!)
    println("Gaji total adalah  : $gaji1")

    gaji1.pajak(gaji!!)

}

fun Int.tunjanganAnak(gaji: Int) : Int{
    var tunjanganAnak = 0

    if (this == 1) {
        tunjanganAnak = (gaji * (1 * 0.05)).toInt()
    } else if (this == 2) {
        tunjanganAnak = (gaji * (2 * 0.05)).toInt()
    } else if (this == 3) {
        tunjanganAnak = (gaji * (3 * 0.05)).toInt()
    } else if (this == 0) {
        tunjanganAnak = 0
    }

    return tunjanganAnak + gaji
}

fun Int.pajak(gaji: Int) {
    var total = (this + gaji)
    //pajak
    if (gaji >= 2_000_000) {
        total  = (gaji * 0.10).toInt()
    } else if (gaji > 1_000_000 && gaji < 2_000_000) {
        total  = (gaji * 0.05).toInt()
    } else if (gaji < 1_000_000) {
        total  = 0
    }

    println("Pajak gaji     : $total")
    println("Gaji Bersih    : ${this-total}")
}
package function

import java.util.*

fun main() {
    val insert = Scanner(System.`in`)

    print("Masukkan Nama        : ")
    var nama = readLine()
    print("Masukkan NIK         : ")
    var nik = readLine()

    //tunjangan ank 5% max 3
    print("Jumlah anak          : ")
    var jumlahAnak = readLine()?.toInt()

    //gaji >= 2jt pajak 10% total gaji | < 1jt tidak kena pajak |1jt < total gaji < 2jt 5%
    print("Masukkan gaji pokok  : ")
    var gajiPokok = readLine()?.toInt()


    biodata(nama.toString(), nik.toString(), jumlahAnak!!.toInt())
    penggajian(gajiPokok!!.toInt(), jumlahAnak!!.toInt())

}

fun biodata(nama: String, nik: String, jumAnak: Int) {
    println("\n")
    println("\n------------------------------------------------")
    println("Nama       : $nama")
    println("NIK        : $nik")
    println("Jumlah anak: $jumAnak")
}

fun penggajian(gajiPokok: Int, anak: Int) {
    var total: Int
    var tunjanganAnak = 0
    var pajak = 0

    //tunjangan anak
    if (anak == 1) {
        tunjanganAnak = (gajiPokok * (1 * 0.05)).toInt()
    } else if (anak == 2) {
        tunjanganAnak = (gajiPokok * (2 * 0.05)).toInt()
    } else if (anak >= 3) {
        tunjanganAnak = (gajiPokok * (3 * 0.05)).toInt()
    } else if (anak == 0) {
        tunjanganAnak = 0
    }

    total = (tunjanganAnak + gajiPokok)

    //pajak
    if (gajiPokok >= 2_000_000) {
        pajak = (gajiPokok * 0.10).toInt()
    } else if (gajiPokok > 1_000_000 && gajiPokok < 2_000_000) {
        pajak = (gajiPokok * 0.05).toInt()
    } else if (gajiPokok <= 1_000_000) {
        pajak = 0
    }

    var gajiBersih = total - pajak

    println("Gaji Pokok     : $gajiPokok")
    println("Tunjangan Anak : $tunjanganAnak")
    println("Total Gaji     : $total")
    println("Pajak          : $pajak" )
    println("Gaji Bersih    : $gajiBersih" )

}




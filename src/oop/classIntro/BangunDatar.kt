package oop.classIntro

import java.util.*

open class BangunDatar {
    var panjang: Int = 0
    var sisi: Int = 0
    var lebar: Int = 0
    val phi: Double = 3.14
    //persegi panjang
    constructor(_panjang: Int, _lebar: Int) {
        panjang = _panjang
        lebar = _lebar
        println("Persegi panjang adalah: ${2 * (panjang * lebar)}")
    }

    constructor(_sisi: Int) {
        sisi = _sisi
        println("Persegi adalah: ${sisi * sisi}")
    }


}
class Hasil:BangunDatar  {
    //persegi panjang
    constructor(_panjang: Int, _lebar: Int):super(_panjang,_lebar){
    }
    //persegi
    constructor(_sisi: Int):super(_sisi){
    }
}

fun main() {
    val input = Scanner(System.`in`)

    print("1. persegi panjang \n2. persegi \n--> ")
    var pilih = input.nextInt()
    if (pilih == 1) {
        print("Masukkan Panjang: ")
        var panjang = input.nextInt()

        print("Masukkan Lebar: ")
        var lebar = input.nextInt()

        val hasil = Hasil(panjang, lebar)
    } else {
        print("Masukkan sisi: ")
        var sisi = input.nextInt()

        val hasil2 = Hasil(sisi)
    }

}
package userInput

import java.util.Scanner
fun main() {
//    println("Masukkan jari jari: ")
//    val jari = readLine()
//
//    println(3.14 * jari!!.toDouble() * jari.toDouble())
//    println("------------------")
    val masuk = Scanner(System.`in`)
    println("Masukkan jari jari ke: ")
    val jari2 = masuk.nextInt()
    val phi = 3.14

    val hasil = phi * jari2 * jari2

    println("Hasil dari luas lingkaran adalah $hasil")

}


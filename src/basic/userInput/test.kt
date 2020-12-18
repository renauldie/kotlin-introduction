package userInput

import java.util.Scanner;

fun main() {
    var input = Scanner(System.`in`)

    println("Nama Barang: ")
    var nama = readLine()
    println("Jumlah Barang: ")
    var barang = input.nextInt()
    println("Harga Barang: ")
    var harga = input.nextDouble()

    var total = harga * barang
    var disc = total * 0.15
    var totalAkhir = total - disc

    if (total >= 200_000) {
        println("Total Yang harus dibayar adalah: $total")
    } else if (total <= 200_000) {
        println("Total Yang harus dibayar adalah: $totalAkhir ")
    }

}
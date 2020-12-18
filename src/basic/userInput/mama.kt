package userInput

import java.util.*

fun main (args: Array<String>) {
    val dataMasuk = Scanner(System.`in`)

    println("       Selamat Datang di Amikom Computer       ")
    println("   Jln.Ringroad Utara,Condongcatur,Depok,Sleman    ")
    println("                   D.I.Yogyakarta                  ")
    println("================================================================")
    println("Daftar Barang : ")
    println("1. Laptop Lenovo IP 330s            Rp.7499000")
    println("2. Laptop Asus M409BA               Rp.5499000")
    println("3. Laptop HP 14s Celeron            Rp.5625000")
    println("4. Laptop DELL XPS                  Rp.15599000")
    println("5. Laptop Acer Nitro 16             Rp.18000000")

    println("----------------------------------------------------------------")
    print("Masukkan Pilihan Barang(Angka)  : ")
    val pertama = dataMasuk.nextInt()
    print("Masukan jumlah barang : ")
    val kedua = dataMasuk.nextInt()
    println("----------------------------------------------------------------")

    val total = if (pertama <= 1 ){
        print("Total harga : ")
        print(7499000 * kedua)
    }else if(pertama >= 2 ){
        print("Total harga : ")
        print(5499000 * kedua)
    }else if(pertama >= 3 ){
        print("Total harga : ")
        print(5625000 * kedua)
    }else if(pertama >= 4 ){
        print("Total harga : ")
        print(15599000 * kedua)
    }else if(pertama >= 5 ){
        print("Total harga : ")
        print(18000000 * kedua)
    }
    else{
        print("Total harga : ")
        print(0 * kedua)
        return
    }

    println(total)
}
package basic.scope

fun main() {

    var p = 10
    var l = 8

    val luasPersegiPanjang: Int = BangunDatar().let {
        it.pangang = p
        it.lebar = l
        it.pangang * it.lebar
    }

    println("Luas persegi panjang: $luasPersegiPanjang")
}
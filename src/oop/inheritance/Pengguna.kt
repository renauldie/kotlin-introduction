package oop.inheritance

open class Pengguna {
    var data: String = ""
    var nominal = 0

    constructor(_data: String) {

    }

    constructor(_data: String, _nominal: Int) {
        data = _data
        nominal = _nominal
        println("$data: $nominal Rupiah")
    }
}

class Nasabah: Pengguna {
    constructor(_data: String): this("Saldo rekening anda " + _data, 30000) {
    }
    constructor(_data: String, _nominal: Int): super(_data, _nominal)
}

fun main() {
    val nasabah = Nasabah("berjumlah")
}
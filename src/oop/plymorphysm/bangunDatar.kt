package oop.plymorphysm


//overloading
class bangunDatar(var nama: String = "") {
    fun hitungLuas(s: Int): Unit {
        println("Luas $nama dengan nilai s = $s adalah ${s * s}")
    }

    fun hitungLuas(p: Int, l: Double): Unit {
        println("Luas $nama dengan nilai p = $p dan l = $l adalah ${p * l}")
    }
}

fun main() {
    val p = bangunDatar()

    p.nama = "Persegi"
    p.hitungLuas(6)

    p.nama  = "Persegi Panjang"
    p.hitungLuas(7, 5.4)
}
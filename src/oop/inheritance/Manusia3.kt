package oop.inheritance

open class Manusia3 {
    open var umur: Int = 0
        get() = field
        set(value) {
            field = value
        }
    open var no: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

class Dosen3 : Manusia3() {
    override var umur: Int = 0
        get() = field
        set(value) {
            field = value - 5
        }

    override var no: Int = 0
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val dosen = Dosen3()
    dosen.umur = 31
    dosen.no =44
    println("Umur saya pada 5 tahun yang lalu adalah ${dosen.umur + dosen.no} tahun")
}
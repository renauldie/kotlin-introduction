package lambda

infix fun Int.kali(a: Int): Int {
    return this * a
}

fun main(){
    val hasil = 5 kali 2
    println(hasil)
    val map = mapOf("Aku" to "Kamu", Pair("Saya", "Dia"))
    println(map)
}
package extension

fun String.hitung(){
    println("Perhitungan $this")
}

fun Int.bagi(a: Int): Int{
    return this/a
}
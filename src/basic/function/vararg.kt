package function

fun main() {
    println(jumlah(2,4,2,12,34))
}

fun jumlah(vararg bilangan : Int ): Int {
    var total = 0
    for (angka in bilangan)
        total += angka
    return total
}
package function

fun main() {
    local()
}

fun local() {
    fun jumlah(a : Int): Int {
        a /4
        return a
    }

    var total = jumlah(10)
    print("Hasil adalah $total")
}
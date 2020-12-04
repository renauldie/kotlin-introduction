package basic.collections

fun main() {
    val brg = Barang("Rinso", "Detergen", 10000)
    println(brg)

    val brgcpy = brg.copy()
    println(brgcpy)

    val brgdup = brg.copy(nama = "Attack", harga = 25000)
    println(brgdup)
}
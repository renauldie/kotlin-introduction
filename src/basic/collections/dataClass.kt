package basic.collections

data class Barang(val nama: String,
                  val kategori: String,
                  val harga: Int)

fun main() {
    val brg = Barang("Rinso", "Detergen", 10000)
    print(brg)
}
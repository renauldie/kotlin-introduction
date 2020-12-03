package basic.collection

fun main() {
    val angka = HashSet<Int>()

    angka.add(2)
    angka.add(4)
    angka.add(6)
    angka.add(2)
    angka.remove(2)

    for (cetak in angka)
        println(cetak)
}
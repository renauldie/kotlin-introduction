package collection

fun main() {
    val nama = mutableListOf("Bety", "Afrig", "Hendra", "Farid", "Hikmah")

    nama.add(1, "Rina")
    nama.add(6, "Ryn")
    nama.remove("Afrig")

    for (i in nama)
        println(i)
}
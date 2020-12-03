package basic.collection

fun main() {
    val kendaraan = mapOf("Mobil" to "Roda 4", "Motor" to "Roda 2", "Bemo" to "Roda 3")

    for (getKey in kendaraan.keys)
        println(kendaraan[getKey])
}
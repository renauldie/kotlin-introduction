package lambda

fun main() {
    val iniLambda: (String, String) -> String = { namaDepan: String, namaBelakang: String ->
        val namaLengkap = "$namaDepan $namaBelakang"
        namaLengkap
    }

    val namaLengkap = iniLambda("Budi", "Hartanto")
    println(namaLengkap)
}
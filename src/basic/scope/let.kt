package basic.scope

fun main() {
    val mahasiswa: String = Mahasiswa().let {
        "Nama: ${it.nama} \nNo Hp: ${it.noHp}"
    }
    println(mahasiswa)
}
package basic.scope

fun main() {
    val mahasiswa: Mahasiswa = Mahasiswa().also {
        "Nama: ${it.nama} \nNo Hp: ${it.noHp}"
    }
    println(mahasiswa)
}
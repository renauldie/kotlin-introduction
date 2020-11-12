package scope

fun main() {
    val mahasiswa: Mahasiswa = Mahasiswa().apply {
        "Nama: ${this.nama} \nNo Hp: ${this.noHp}"
    }
    println(mahasiswa)
}
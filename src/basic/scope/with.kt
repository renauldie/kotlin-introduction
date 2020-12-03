package basic.scope

fun main() {
    val mahasiswa: String = with(Mahasiswa()) {
        "Nama: ${this.nama} \nNo Hp: ${this.noHp}"
    }
    println(mahasiswa)
}
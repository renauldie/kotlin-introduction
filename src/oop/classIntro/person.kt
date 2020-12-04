package oop.classIntro

class person(val nama:String, val umur: Int) {
    //
}

fun main() {
    val person = person("Budi", 32)

    println("Nama = ${person.nama}")
    println("Umur = ${person.umur}")
}
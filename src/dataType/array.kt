fun main() {

    val names: Array<String> = arrayOf("Tono", "Mang Oleh", "Hiu Makan Tomat")
    //names.set(0, "Rudi")
    //names[0] = "Rudi"
    println(names[0])

    println("------------ end -----------")

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    println("------------ end -----------")

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Ren"
    members[1] = "Ren1"
    members[2] = "Renx"
    members[3] = null
    members[4] = "Renzy"
    println(members.size)
}
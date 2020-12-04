package basic.collections

fun main() {
    val buah = HashMap <Char, String>()

    buah['J'] = "Jeruk"
    buah['A'] = "Apple"
    buah['R'] = "Rambutan"

    for (getKey in buah.keys)
        println(buah[getKey])

    println()

    buah.replace('J', "Jambu")

    for (getKey in buah.keys)
        println(buah[getKey])
}
package dataType

fun main() {

    var firstName: String = "Muhammad"
    var lastName: String = "Renauldi"
//
    var address: String = """
        √One Infinite Loop Street,
        √Cupertino, California 95014
        √United State of America
        """.trimMargin("√")
//
    println(firstName)
    println(lastName)
    println(address)
}
package dataType

fun main() {

    var firstName: String = "Muhammad"
    var lastName: String = "Renauldi"

    var address: String = """
        √One Infinite Loop Street, 
        √Cupertino, California 95014,
        √United State of America
        """.trimMargin("√")

    println(firstName)
    println(lastName)
    println(address)

//    var function.fullName: String = "$firstName $lastName"
//    println(function.fullName)
//
//    var fullName2: String = firstName + " " +lastName
//    println(fullName2)
//
//    var desc: String = "$function.fullName length = ${function.fullName.length}"
//    println(desc)
}
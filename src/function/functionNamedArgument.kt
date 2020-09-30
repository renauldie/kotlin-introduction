package function

fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    //Commonly Used
    fullName("Muhammad", "Renauldi", "Ren")
    //Named Argument
    fullName(
        lastName = "Ren",
        firstName = "Muhammad",
        middleName = "Renauldi"
    )
}
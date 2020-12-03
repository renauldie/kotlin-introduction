package function

fun hello(firstName: String, lastName: String? = null) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    hello("Odading")
    hello("Mang ", "Oleh")
    hello("Renn")
    hello("Joko", "Jony")
}
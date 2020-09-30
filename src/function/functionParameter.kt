package function

fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}

fun main() {
    sayHello("Mang", "Oleh")
    sayHello("Renn", null)
    sayHello("Tri", "Hartono")
}
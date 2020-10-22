package userInput
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    print("Input Name: ")
    var name = input.readLine()
    print("Input Age: ")
    var age = input.readLine()

    println("My name is $name, my age is $age")
}
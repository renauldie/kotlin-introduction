package userInput

import java.util.Scanner

fun main(args: Array<String>) {

    val scanner  = Scanner(System.`in`)
    print("Input first number: ")
    val num1 = scanner.nextInt()
    println("The first input is : $num1")
    print("Input second number: ")
    val num2 = scanner.nextInt()
    println("The second input is : $num2")

    val sum = num1+num2

    println("The sum of the two inputs is : $sum")
}

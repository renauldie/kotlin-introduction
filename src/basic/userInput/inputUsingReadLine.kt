package userInput

fun main(){
    print("Just input your name: ")
    val name = readLine()
    print("Just input your age: ")
    val age = readLine()

    val total = age!!.toInt() + 23
    println(total)
    //output
    println("My name is $name. My age is ${age}yo")
}
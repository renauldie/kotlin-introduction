package looping

fun main() {

    // 1st Method
    val numbers = 5
//    // until x < numbers
//    println("Half Open Range")
//    for (x in 0 until numbers)
//        print("$x ")
//
//    println()
//
//    println("Closed Range")
//    // .. x = numbers
//    for (x in 0..numbers)
//        print("$x ")
//
//    println()
//    println("Decreasing Range Using Step")
//    //step = increment/decrement
//    for (x in 10 downTo 0 step 3)
//        print("$x ")



    var names = arrayOf("Muhammad", "Renauldi", "Jamal", "Joko", "Siti", "Siri")
//
    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Looping Total = $total")
//
//    val arrayRange = names.size - 1
//    for (i in 0..arrayRange) {
//        println("Index $i = ${names.get(i)}")
//    }

}

package dataType

fun main() {

    // Byte Int Float Long
   var age: Long = 18
 println("Value of Age: $age")

//    var dummy: Float = 10.11F
//    println("Value of Sample: " + dummy)

    var price: Long = 9_000_000_000;
    println("Value of price: $price")

    var price1: Int = price.toInt()
    println(price1)

    var price2: Long = 1_000_000_000
    var priceLong: Int = price2.toInt()
    println(priceLong)

}
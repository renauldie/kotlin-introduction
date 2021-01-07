package dataType

fun main() {

    // Byte Int Float Long Double

    var age: Int = 18
    println("Value of Age: $age")

    var dummy: Float = 10.11F
    println("Value of Sample: " + dummy)

    var dummy2: Double = 10.11
    println("Value of Sample: " + dummy2)

    var price: Long = 9_000_000_000;
    println("Value of price: $price")

    var price2: Long = 1_000_000_000
    var priceLong: Int = price2.toInt()

    var pirce3 : Long = 2_000_000_000

    println(priceLong)

}
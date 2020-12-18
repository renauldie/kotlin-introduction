package oop.`interface`

interface Karnifora {
    fun makan() {
        println("Hewan ini makan daging")
    }
}

interface Herbifora {
    fun makan() {
        println("Hewan ini makan tumbuhan")
    }
}

class Omnivora: Karnifora, Herbifora {
    override fun makan() {
        super <Karnifora>.makan()
        super <Herbifora>.makan()
    }
}

fun main() {
    val ayam = Omnivora()

    ayam.makan()
}
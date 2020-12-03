package looping

fun main() {

    var i = 0
    print("This is while ")
    while (true) {
        print("$i ")
        i++

        if (i > 7) {
            break
        }
    }

    // ---------------------- end -----------------------
    println()
    print("This is for ")
    for (i in 1..9) {

        if (i % 2 == 0) {
            continue
        }

        print("$i ")
    }

    //---------------- end -----------------------
    i = 0
    println()
    print("This is do while ")
    do {
        print("$i ")
        i++

        if (i > 10) {
            break
        }
    } while (true)

}
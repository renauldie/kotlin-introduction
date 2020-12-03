package basic.expression

fun main() {

    var score = "A"
    when (score) {
        //1st Method
        "A" -> {
            println("Amazing")
        }
        "B" -> {
            println("Good")
        }
        "C" -> {
            println("Not Bad")
        }
        "D" -> {
            println("Bad")
        }
        else -> {
            println("Whoops.... unknown value")
        }
        //2nd Method
//        "A" -> println("function.hello, u have got good score")
//        "B" -> println("nice try")
//        else -> println("Whoops Unknown Value")
    }

    //-------------------- end ------------------------

//    when (score) {
//        // if(score == "A" || score == "B" || score == "C")
//        "A", "B", "C" -> {
//            println("Congratulation you passed the exam")
//        }
//        else -> {
//            println("Sorry, you didn't pass the test")
//        }
//    }

    //-------------------- end ------------------------

//    score = "E"
//    val scoreToPass: Array<String> = arrayOf("A", "B", "C")
//    when (score) {
//        in scoreToPass -> println("Congratulation you passed the exam")
//        !in scoreToPass -> println("Sorry, you didn't pass the test")
//    }

    //-------------------- end ------------------------

//    val name = "Ren"
//    when (name) {
//        is String -> println("Name is String")
//        !is String -> println("Name is not String")
//    }

    //-------------------- end ------------------------

//    val examScore = 91
//    val record = "B"
//    when {
//        examScore > 90 && record == "A" -> println("Amazing")
//        examScore > 80 && record == "B" -> println("Good Job")
//        examScore > 60 && record == "C" -> println("Not Bad")
//        else -> println("Happy Repeating this class :(")
//    }

    //-------------------- end ------------------------
}
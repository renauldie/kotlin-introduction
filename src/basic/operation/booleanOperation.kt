package operation

fun main() {

    val examPoint = 80
    val attendant = 80
    val extraPoints = 71

    val isPassExam = examPoint > 75
    val isPassAttendant = attendant > 75
    val isPassExtraPoints = extraPoints > 75

    val didPass = isPassExam && isPassAttendant && isPassExtraPoints
    //val didPass = isPassExam && isPassAttendant || isPassExtraPoints
    //val didPass = isPassExam || isPassAttendant && isPassExtraPoints
    println(didPass)

}
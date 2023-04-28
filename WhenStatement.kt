
fun main() {

    var number = 14

    val whatTime= when (number) {
        in 0..7 -> "good morning"
        in 7..10 -> "go waking"
        12 -> "time for lunch"
        13,14 -> "go for nap"                            // use , here means or
        else -> "good day"
    }
    println(whatTime)
}
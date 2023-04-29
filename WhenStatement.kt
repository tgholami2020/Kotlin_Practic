
fun main() {

    var number = 14

    val whatTime= when{
        number in 0..7 -> "good morning"
        number in 7..10 -> "time for waking"
        number==12 -> "time for lunch"
        number==1 || number==14 -> "time for nap"                            // use "," here means or
        else -> "good day"
    }
    println(whatTime)
}
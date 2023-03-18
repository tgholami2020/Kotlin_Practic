

fun main(){

val digit= 1234.digitCount           //count the number
    println(digit)
}

val Int.digitCount: Int              //add new property to Int class
    get()= this.toString().length

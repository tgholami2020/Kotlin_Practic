

fun main(){

val digit= "how are you?".digitCount           //count the number
    println(digit)
}

val String.digitCount: Int              //add new property to Int class
    get()= this.toString().length

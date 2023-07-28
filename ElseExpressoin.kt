
fun main(){
    val a = 5
    val b = 10
    val min= if (a<b) a else b
    val max= if (a>b) a else b

    println("the min number is: $min" +
            "the max number is: $max")

    val myAge = 34
    val answer = if (myAge<19 && myAge > 13) " you are teenager" else "you are not teenager"
    println("the result is : $answer")
}
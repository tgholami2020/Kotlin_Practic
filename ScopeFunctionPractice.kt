

fun main(){
 val number: Int?= 123
    val x= number?.let {
        val number2 = it +1
        number2
    } ?: 3

    println(x)
}
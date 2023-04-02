
//Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol.
operator fun String.get(range:IntRange)= substring(range)
val str= "this is a text for example and nothing else "

operator fun Int.times(str:String)= str.repeat(this)

fun main(){
    println(str[0..20])
    println(2* "bye")
}
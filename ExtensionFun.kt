

fun main(){

    val str1:String= " Hello"
    val str2:String= " world"

    var str3:String =" hey"


    println(str3.add(str1,str2))
}
//extension fun added to String class
fun String.add(s1:String,s2:String): String{
    return this + s1+ s2
}

fun main(){
    val words= listOf("taha","zahra","tahira","zohra")
    val empty= emptyList<String>()                                     //an empty list

    val first= empty.firstOrNull()                                     //null
    val last= empty.lastOrNull()                                       //null
    val firstT=words.firstOrNull { it.startsWith("t") }          //first word starts with "t"
    val firstZ=words.firstOrNull{it.startsWith("z")}             //first word starts with "z"
    val lastT=words.lastOrNull{it.startsWith("t")}               //last word starts with "t"
    val lastZ=words.lastOrNull{it.startsWith("z")}               //last word starts with "z"

    println("the first element of empty list is: $first")
    println("the last element of empty list is: $last")
    println("first element start with T is: $firstT")
    println("first element start with Z is: $firstZ")
    println("last element start with T is: $lastT")
    println("last element start with Z is: $lastZ")

}
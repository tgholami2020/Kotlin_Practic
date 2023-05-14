

fun main(){
    // Find and FindLast function return the first and last collection elements that matches the given predicate
    //if there are no such elements return null
    val words= listOf("lets","find","something","in","collection","somehow")
    val first= words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some")}
    val nothing= words.find { it.contains("nothing") }

    println("the first word start with  some is $first")
    println("the last word start with some is $last")
    println("the first word containing nothing is $nothing")
}
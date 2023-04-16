import kotlin.math.abs

fun main(){
    val numbers= listOf(5,4,2,1,3,-10)
    val natural = numbers.sorted()                              //normal way from small to big number
    val inverted = numbers.sortedBy { -it }                     //apposite way from big to small numbers
    val descending = numbers.sortedDescending()                 //from big to small
    val descendingBy= numbers.sortedByDescending { abs(it) }    //Sorts it in the inverted natural order of items' absolute values by using abs(it) as a selector function
    
    println("numbers :$numbers")
    println("natural :$natural")
    println("inverted :$inverted")
    println("descending :$descending")
    println("descendingBy :$descendingBy")
}
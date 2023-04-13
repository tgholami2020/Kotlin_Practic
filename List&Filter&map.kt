
fun main(){
    val numbers= listOf(1,-1,4,6,-5,3,8,-9,10)
    //using filter
    val positive= numbers.filter { x -> x>5 }
    val negative= numbers.filter { it<1 }
    //using map
    val DoubleNumbers= numbers.map { x -> x*2 }
    val tripleNumbers= numbers.map { it *3 }

    println(positive)
    println(negative)
    println(DoubleNumbers)
    println(tripleNumbers)
}
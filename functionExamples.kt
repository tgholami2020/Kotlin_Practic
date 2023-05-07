
fun main(){
    var number= listOf(1,2,3,4,5,6,7)
    val double=number.map { x-> x*2 }                     //double of numbers
    val triple= number.map { it*3 }                       //triple of numbers
    val decrement=triple.map { it-3 }                     //decrement 3 from triple

    println(double)
    println(triple)
    println(decrement)
}
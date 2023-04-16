
fun main(){
    //minOrNull and maxOrNull functions returns the smallest and biggest number in collection if collection is empty returns null
    val numbers= listOf(1,2,3,4,5)
    val empty= emptyList<Int>()
    val only= listOf(3)

    println("Numbers :$numbers, min : ${numbers.minOrNull()}, max : ${numbers.maxOrNull()}")
    println("empty :$empty, min: ${empty.minOrNull()},max: ${empty.maxOrNull()}")
    println("only :$only, min: ${only.minOrNull()},max: ${only.maxOrNull()}")
}
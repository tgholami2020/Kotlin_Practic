

fun main(){
    val numbers= listOf(1,-2,3,-4,5,-6)
    //Function Any returns true if the collection at least  contain one element that matches the given predicate
    val anyNegative= numbers.any { it<0 }                       //true
    val anyGreater6= numbers.any { it>6 }                       //false

    println("$anyNegative " + "$anyGreater6")

    //Function all returns true if all elements in collection matches the given predicate
    val allEven = numbers.all{it% 2==0}                         //false
    val isGreater6 = numbers.all { it<6 }                       //true

    println("$allEven "  +  "$isGreater6")

    //Function none return true if there is no elements that matches the given predicate in the collection
    val allEven2= numbers.none { it% 2==1 }                     //false
    val allLess6= numbers.none { it>6 }                         //true

    println("$allEven2 " + " $allLess6")
}


fun main(){
    val numbers= listOf(1,-2,3,-4,5,-6)
    val oddNumbers= numbers.partition { it %2==0 } //partition function split original collection in to pairs of list odd and even numbers
    val negative= numbers.partition { it<0 } //partition function splits original collection into pairs of list negative and positive numbers


    println("the list of numbers are: $numbers")
    println("list of odd numbers are: $oddNumbers")
    println("negative numbers are: $negative")

}
import kotlin.Pair

fun main(){
    val name= "Tahira"
    val lastName= " Gholami"
    val fullName= name + lastName
    println("My full name is : $fullName")

    val date= Triple(5,9,1988)             //declare Triple

    //extract the Triple
    val x1= date.first
    val x2= date.second
    val x3= date.third
    //ignore the x1 by _
    println("_,$x2,$x3")

    val coordinates = Pair(2,3)                            //declare Pair
    //extract pairs
    val row= coordinates.first
    val column= coordinates.second

    println("The row is :$row and the Column is : $column")
}
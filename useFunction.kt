
fun main(){
    val number= listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    val evenNum= number.count{ it % 2==0}                 //how many even number are in the list
    println(number)
    println(evenNum)

    val evens= number.filter { x-> x %2==0 }              //just print even numbers
    println(evens)

    val odds= number.filter { x-> x%2==1 }                //just print odd numbers
    println(odds)
}
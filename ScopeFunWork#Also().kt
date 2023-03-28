
fun main(){
    //also() work        {refer the context object by using "it", the return value is "context object"}
    val numberList: MutableList<Int> = mutableListOf(1,2,3)

    val duplicateNumbers = numberList.also {
        println("elements of list are : $it")
        it.add(4)
        println("updated list after adding one element are : $it")
        it.remove(2)
        println("updated list after removing one element are : $it")
    }
    println("original numbers are: $numberList")                       //print 1,2,3
    println("duplicated numbers are: $duplicateNumbers")               //print 1,2,3
}

fun main(){
    //mySum using for loop
    val result= mySum()
    println(result)

    //secondIterator using while iterator
    val whileIterator= secondIteratorUsingWhile()
    println(whileIterator)

    //doWhile iterator
    val doWhile= doWhile()
    println(doWhile)
}

fun mySum () {
    var collectNumber = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i in collectNumber) if (i % 2 == 0) {
        println("$i")
    }
}

fun secondIteratorUsingWhile(){
    var num=1
    while (num<7){
        println(num)
        num++
    }
}

fun doWhile(){
    var num =5
    var sum=0
    do {
        sum+=num
        num--
    }while (num>0)
    println("sum of numbers is $sum")             //sum is 15
}

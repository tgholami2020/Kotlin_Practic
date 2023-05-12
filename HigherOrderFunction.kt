//here is a higher order function that takes two int and one function as a parameter
fun calculate (x:Int, y:Int,operation:(Int,Int)->Int):Int{
return operation(x,y)                              //the higher order function return the result of operation
}

fun sum(x:Int, y:Int)= x+y                         //declare a function that matches the operation signature

fun main(){

    val sumResult= calculate(3,6, ::sum)     //invoke the higher order function with two integer values and the sum function :: is th notation that reference  function by th name in kotlin

    val multipleResult= calculate(3,6,{a,b -> a*b})  //invoke the higher order function passing in a lambda as a function argument

    val reduce= calculate( 10,7,{a,b-> a-b})         //invoke the higher order function passing in a lambda as a function argument

    println("sum Result is: $sumResult multiple result is: $multipleResult reduce result is: $reduce")

}
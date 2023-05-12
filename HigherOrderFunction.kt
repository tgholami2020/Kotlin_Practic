
fun calculate (x:Int, y:Int,operation:(Int,Int)->Int):Int{
return operation(x,y)
}

fun sum(x:Int, y:Int)= x+y

fun main(){

    val sumResult= calculate(3,6, ::sum)

    val multipleResult= calculate(3,6,{a,b -> a*b})

    val reduce= calculate( 10,7,{a,b-> a-b})
    println("sum Result is: $sumResult multiple result is: $multipleResult reduce result is: $reduce")

}
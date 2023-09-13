
fun main(){
    val catAge = calculateCatAge(2)
    if(checkAge(catAge))
    println("This cat is old ($catAge)")
    else
        println("This cat is young ($catAge)")
}
fun calculateCatAge(age: Int): Int = age*3   //There is more than one way to write function return in Kotlin
val changeFunToLambda: (age:Int) ->Int = {a -> a*3}
// write another function to return a boolean
fun checkAge(catAge: Int): Boolean{
    return catAge>14
}


class MyMathExercise(){
    companion object{
        fun sum(number:Int): Int{
            return (1..number).fold(0) {a,b -> a+b}            //fold accumulate numbers from left to right

        }
    }
}

fun main(){
    val myMath= MyMathExercise
    println(myMath.sum(3))    //6
}

fun main(){
    var discountPercentage: Int=0
    var offer:String=""
    val item="Google Chromecast"
    discountPercentage= 20
    offer="Sale - up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    //String concatenate

    val numberOfAdults=20
    val numberOfKids=30
    val total= numberOfAdults+numberOfKids
    println("the total party size is :$total")

    //Message Formatting
    val baseSalary= 5000
    val bounceAmount=1000
    val totalSalary=baseSalary+bounceAmount
    println("congratulations for your bounce! you will receive a total of $totalSalary (additional bounce).")

    //Basic Math Operation
    val firstNumber= 10
    val secondNumber= 5
    val result1= firstNumber+ secondNumber

    println("$firstNumber + $secondNumber = $result1")

    //Better way is writing add function for reusable code
    fun add( a: Int,b: Int): Int{
        val sum= a+b
        return sum
    }
    fun subtract(a:Int,b:Int):Int{
        val sub= a-b
        return sub
    }
    val number1= 10
    val number2= 5
    val number3= 8
    val result2= add(number1,number2)
    val result3= add(number1,number3)
    println("$number1 + $number2 = $result2")
    println("$number1 + $number3 = $result3")
    
    val sub2=subtract(number1,number2)
    println("$number1 - $number2 = $sub2")


}
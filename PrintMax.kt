
fun main(){
    val max= PrintMax(5,5)

}
fun PrintMax(num1: Int,num2:Int){
    var maxNum=when{
        num1> num2 -> "num1 is bigger"
        num2> num1 -> "num2 is bigger"
        num1== num2-> "they are equal"
        else -> "Invalid"
    }
    println(maxNum)
}
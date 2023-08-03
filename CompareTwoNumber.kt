fun main(){

    fun compareTwoNumbers(timeSpendToday:Int, timeSpendYesterday:Int) : Boolean {
        return  timeSpendToday >  timeSpendYesterday
    }
    println("Have I spend more time using my phone today: ${compareTwoNumbers(300,250)}")
    println("Have I spend more time using my phone today: ${compareTwoNumbers(250,300)}")
    println("Have I spend more time using my phone today: ${compareTwoNumbers(300,300)}")
}
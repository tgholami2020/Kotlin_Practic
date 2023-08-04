
fun main(){
    val morningNotifications= 51
    val eveningNotification= 135

    printNumberOfSummary(morningNotifications)
    printNumberOfSummary(eveningNotification)
}
fun printNumberOfSummary(numberOfMessages:Int){
    if (numberOfMessages <100){
        println("You have ${numberOfMessages} notifications")
    } else{
        println("Your Phone is blowing up! you have +99 notifications.")
    }
}
fun main(){
    //Default parameters
    val operatingSystem= "ChromeOS"
    val emailId= "tahere.gholami67@gmail.com"
    println(displayAlertMessage(operatingSystem,emailId))

    val secondUserOperatingSystem= "Windows"
    val secondUserEmailId= "user-tow@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem,secondUserEmailId))

    val thirdUserOperatingSystem= "MAC OS"
    val thirdUserEmailId= "user-third@gmil.com"
    println(displayAlertMessage(thirdUserOperatingSystem,thirdUserEmailId))


}

fun displayAlertMessage(operatingSystem: String, emailId: String): Any {
    val notification= "There is a new sign-in request on $operatingSystem for your google account $emailId."
    return notification
}
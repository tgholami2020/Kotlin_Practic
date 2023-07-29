
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
}

fun main(){

    fun cityWerther(name:String,lowTemperature:Int, highTemperature:Int,chanceOfRain: Int){
        println("City: $name")
        println("Low Temperature: $lowTemperature")
        println("High Temperature: $highTemperature")
        println("Chance of Rain: $chanceOfRain%")
    }
    println(cityWerther("Ankara",27,31,82))
    println(cityWerther("Tokyo",32,36,10))
    println(cityWerther("Cape Town",59,64,2))
    println(cityWerther("Guatemala City",50,55,7))
}
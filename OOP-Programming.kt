
fun main(){
    //make object as many as you want
val myCar= Car2("Red","R45")
val secondCar= Car2("Green","XXC")
    println(" Car color is ${myCar.color} and the Model is ${myCar.model}")
    println(" Second Car color is ${secondCar.color} and the Model is ${secondCar.model}")
    println(myCar.speed(40,100))
    println(myCar.drive())

    //truck
    val track= Truck("Magenta","TTT")
    track.drive()
    track.speed(20,40)
}

//create a class with constructors
open class Car2(var color:String,
           var model:String){
//    init {
//        if(color == "Green"){
//            println("Yay... green")
//        }else{
//            println("the $color is not Green ")
//        }
//    }

    open fun speed(minSpeed:Int, maxSpeed:Int){
    println("min speed is $minSpeed and max speed is $maxSpeed")
    }
     open fun drive(){
         println(" The Car is driving.....")
     }
 }
// Truck inherits from Car2 
class Truck(color: String, model: String): Car2(color, model) {
    override fun drive() {
        println("Drive like a truck....")
    }

    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed= minSpeed*maxSpeed
       println("The truck is full speed $fullSpeed")
    }
}
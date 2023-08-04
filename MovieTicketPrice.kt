fun main(){
     val child=5
     val adult= 28
     val senior= 87

     val isMonday= true

    println("The movie ticket price for a person aged $child is \$${ticetPrice(child,isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticetPrice(adult,isMonday)}")
    println("The movie ticket price for a person aged $senior is \$${ticetPrice(senior,isMonday)}")
 }
 fun ticetPrice(age:Int, isMonday:Boolean):Int{
      return when(age){
          in 1..12 -> 15
          in 13..60 -> if (isMonday) 25 else 30
          in 61..100 -> 20
          else -> -1
      }
 }
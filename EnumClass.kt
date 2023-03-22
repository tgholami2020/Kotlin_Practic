import CreditCardType.*

enum class CreditCardType{                 //enum class
    //enum constants
    SILVER,               //ordinal 0      //name "SILVER"
    GOLD,                 //ordinal 1      //name  "GOLD"
    PLATINUM              //ordinal 2      //name  "PLATINUM"
}
 fun main(){

     // enums constants are objects of enum class type: ordinal and name
     val creditCartType :CreditCardType= GOLD

     // each enums object has two properties
     println(GOLD.ordinal)
     println(GOLD.name)

     //each enum object has two methods: values() and valueOf()
     val myConstant= values()
     myConstant.forEach { println(it) }             //print the enums objects like Array

     //using in when statement
     when(creditCartType){
         SILVER -> println("i get the silver card")
         GOLD ->  println("i get the gold card")
         PLATINUM ->  println("i get the platinum card")
     }
 }

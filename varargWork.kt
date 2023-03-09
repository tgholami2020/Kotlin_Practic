//work with parameters ,add array as a parameter with "vararg"
fun sayHello(greeting:String, vararg itemsTOGreet:String){
   itemsTOGreet.forEach { itemTOGreet->
      println("$greeting  $itemTOGreet")
   }
}
//giving default value
fun greet(greet:String="hi",name:String="kotlin")= println("$greet $name")



fun main() {
   val books= arrayOf("math","programming","design")
   greet(name = "nate")
   //use * to indicate an array
   sayHello(greeting = "hi", itemsTOGreet = *books)
}





//work with parameters ,single expression
fun sayHello(greeting:String,itemsTOGreet:List<String>){
   itemsTOGreet.forEach { itemsTOGreet->
      println("$greeting  $itemsTOGreet")
   }
}


fun main() {
   val books= listOf("math","programming","design")
   sayHello("hi",books)
}





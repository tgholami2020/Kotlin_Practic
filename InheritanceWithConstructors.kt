
fun main(){
    val dog= Dog("black","doggy")


}
open class Animal(val color: String) {                       //this is super class must be Open to be inherited
    init {
        println("From Animal init : $color")
    }
}

class Dog( color: String, var name: String): Animal(color){                       //Dog class inherit from Animal class
  init {
      println("From Dog init : $color $name")
  }
}

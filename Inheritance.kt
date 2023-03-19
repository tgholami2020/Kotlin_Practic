
fun main(){
    val dog= Dog()
    val cat= Cat()
    val animal= Animal()
    animal.Eat()
    cat.Eat()
    dog.Eat()
}
open class Animal() {                       //this is super class must be Open to be inherited
     open val color: String = " white"      //the variable must be open to be inherited

     open fun Eat(){                        //the function must be open to be inherited
        println("Animal is eating")
    }
}
class Cat() : Animal(){                      //Cat class inherit from Animal
    var name:String=" cat"
    fun Meow(){
        println("the cat is meowing")
    }

    override fun Eat() {
        super.Eat()                          //this super refers to Animal class
        println("the cat is eating")
    }
}
class Dog(): Animal(){                       //Dog class inherit from Animal class
    var name: String=" Dog"

    fun Bark(){
        println(" the dog id barking")
    }

    override fun Eat() {
        super.Eat()                   //this super refers to Animal class
        println("the dog is eating")
    }
}

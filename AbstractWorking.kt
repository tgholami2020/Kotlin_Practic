
abstract class Human(){                      // You can not create instance of abstract class
    abstract var name:String                 // Abstract properties are open by default and do not have body
    abstract fun eat()                       // Abstract properties are open by default and do not have body
    open fun getHeight(){                    // An open function: is ready to be overridden

    }
    fun goToSchool(){                        // A normal function: public and final by default
    }
}
class Afghan: Human(){
    override var name: String="Afghan_name"

    override fun eat() {
        println("i am overridden")
    }
}
fun main(){
    var afghan= Afghan()
    println(afghan.name)
    afghan.eat()

}

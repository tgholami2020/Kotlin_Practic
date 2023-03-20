
fun main(){
    val dog= Dog("black","doggy")


}
open class Animal {                                                     //this is super class must be Open to be inherited
    var color: String=""
    constructor(color: String) {                                        //no var and val inside the constructor
        this.color=color
        println("from animal : $color")
    }
}

class Dog: Animal{
    var name:String =" "
    constructor(color: String,name: String) :super(color){              //we must call the super class constructor
        this.name= name
        println("from Dog : $color  and $name")
    }
}

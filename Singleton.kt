
fun main(){
    //can access objects methods and properties without making instances
    CustomerData.myName()
    CustomerData.id
    println(CustomerData.myName())
    CustomerData.id= 80
    println(CustomerData.id)

    CustomerData.myMethod("hello")
}

open class mySuperClass(){                     //super class
    open fun myMethod(s:String){
        println(" I am Super Class")
    }
}

object CustomerData : mySuperClass(){         //object can inherit from super class
    var id: Int= 2                           //behaves like STATIC variable

    fun myName(): String{                    //behaves lie STATIC method
        return "Sara"
    }

    override fun myMethod(s: String) {       //currently behaving like STATIC method
        super.myMethod(s)
        println("object Coustomerdata:" + s)
    }
}
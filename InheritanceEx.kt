
//class hierarchy 
open class A (){
var name:String="Tahira"

   init {
       println(" I am <A>!")
   }
}

open class B: A() {
var color:String=""
    init {
        println("I am <B>!")
    }
}

class C: B (){
var age:Int = 12
    init {
        println("I am <C>!")
    }
}
fun main(){
    val c= C()                  //print A ,B an C
    val a= A()                  //print just A
    val b= B()                  //print A and B

}
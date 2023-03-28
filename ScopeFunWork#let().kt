
fun main(){
    // let() work     {refer to context object by using "it", the return value is the lambda result}
    // use the let function to avoid  NullPointerException

    var name:String?= "Hello"

   val nameLength= name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length                     //lambda return the length
    }
    println(nameLength)

}

fun main(){
    println(sumFun(2,4))
    println(addTwoNumber(3,7))
    myName("Tahira")
    name("Tahira Gholami")

    //trailing lambda, having a function as a parameter
    enhanceMessage("Hello there,"){
        print(it)
        add(12,13)
    }
}

fun sumFun (a:Int, b:Int): Int{
    return a+b
}
//val LambdaName : Type = {ParametersList -> codeBody}
 val addTwoNumber : (Int,Int) ->Int = {a,b -> a+b}                  //change the sumFun to a lambda

//let's write a lambda with no return type
fun myName(name: String){
    println(name)
}
val name : (String)-> Unit ={
    println("my name is $it")
}

fun enhanceMessage( message: String, funAsParameter:(String)-> Int){
    println("$message ${funAsParameter("Hey")}")
}
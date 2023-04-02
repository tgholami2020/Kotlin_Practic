//by defining generic we can use different data types later
fun<T,E> JustForTest(param1:T,param2:E){
    println("$param1 and $param2")
}
fun main(){
    // simply adding int and string data type here
    JustForTest<String,Int>("Hello", 20)
}
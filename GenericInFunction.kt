
fun<T,E> JustForTest(param1:T,param2:E){
    println("$param1 and $param2")
}
fun main(){
    JustForTest<String,Int>("Hello", 20)
}
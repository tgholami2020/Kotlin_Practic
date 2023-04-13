
fun main(){
    //map is collection of key/value 
    val account: MutableMap<Int,Int> = mutableMapOf(1 to 100,2 to 200,3 to 300)
    println(account.size)
    println(account.get(2))
    println(account.put(4 , 400))
    println(account)
}

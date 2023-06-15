
fun main(){
    val (x,y,z)= arrayOf(2,4,7)                               //destructuring declarations can save lines of code
    println( "x = $x  y= $y  z= $z")

    val map= mapOf("Alice" to 21 , "Paul" to 25)
    for ((name,age) in map){
        println("$name is $age years old")
    }

    val (num,name)= Pair(1 , " one")
    println("num =$num   name =$name")

}
class Pair<K,V>(val first: K,val second:V){
    operator fun component1():K{
        return first
    }
    operator fun component2(): V{
        return second
    }
}
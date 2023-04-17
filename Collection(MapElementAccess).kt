
fun main(){
    //when apply to a map [] operator, returns the value corresponding to the key, or null if there is no such key in the map
    val map= mapOf("key" to 42)
    val value1= map["key"]                              //42
    val value2= map["key2"]                             //null
    val value3: Int = map.getValue("key")           //42
    val mapWithDefault= map.withDefault { k -> k.length  }
    val value4= mapWithDefault.getValue("key2")      //4

    try {
        map.getValue("anotherKey")                   //no such element exception
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
    println(value1)
    println(value2)
    println(value3)
    println(value4)
}
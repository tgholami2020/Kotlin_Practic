
fun main(){
    //mutable list
    val books1= mutableListOf("android","history","comic")
    books1.add("paint")
    println(books1)
    //immutable list
    val books= listOf("math","programming","design")
    books.forEach { book ->
        println(book)
    }
    //mutable map
    val map1= mutableMapOf(12 to "a",13 to "b",14 to "c")
    map1.put(15 ,"d")
    println(map1)
    //immutable map
    val map= mapOf(1 to "a",2 to "b" , 3 to "c")
    map.forEach { key, value-> println("$key -> $value") }


}
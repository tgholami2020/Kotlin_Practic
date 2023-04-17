
fun main(){
    //getOrElse function provides safe access to element of a collection
    //it takes an index and a function that provides the default value in cases when the index is out of bounds
    val list= listOf(1,10,20)

    println(list.getOrElse(1){50})
    println(list.getOrElse(10){50})
    
    //get or else can also applied to map[] to get the value for the given key
    val map= mutableMapOf<String,Int?>()
    println(map.getOrElse("x"){1})
    map["x"]=3
    println(map.getOrElse("x"){1})
    map["x"]=null
    println(map.getOrElse("x"){1})

}
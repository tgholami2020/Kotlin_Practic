
fun main(){
    //zip function merges two given collection into a new collection
    val numbers= listOf(1,2,3,4,5)
    val words= listOf("a","b","c","d","e")
    val resultPairs= numbers zip words                          //merge them into a list of pairs.
    val resultReduce= numbers.zip(words){a,b -> "$a$b"}         //merge them into list of String value by the given transformation

    println(numbers)
    println(words)
    println(resultPairs)                                        // [(1,a),(2,b),(3,c),(4,d),(5.e)]
    println(resultReduce)                                       //[1a,2b,3c,4d,5e]
}
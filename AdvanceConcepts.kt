
fun main(){
    //we can pass any Type values Int or String when we use Generics.
    val listOfItems= listOf("Taha","Reza","Ava")                           //list of String
    val listOfNumbers= listOf(43,56,78)                                    //list of Int
    val finder = Finder(list= listOfItems)
    finder.findItem("Reza"){
        println("Found $it")
    }
}
class Finder<T>(private val list: List<T>){
    fun findItem(element:T, foundItem: (element:T?) ->Unit){
        val itamFoundList = list.filter {
            it== element
        }
        if (itamFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itamFoundList.first())
    }
}
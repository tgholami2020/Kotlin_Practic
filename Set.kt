
fun main(){
   //Set is unordered collection that does not accept duplication
val name : MutableSet<String> = mutableSetOf("Ali","Ahmad","Taha")
    name.add("Ali Reza")
    name.remove("Ali")
    println(name)
}


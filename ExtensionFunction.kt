
fun String.getAllWords(): List<String>{               //first function name.new function name, we add getAllWords fun to String function
    return this.split(" ")
}


fun main(){
    var a :String = "how are you?"
    val words= a.getAllWords()
    println(words)
}
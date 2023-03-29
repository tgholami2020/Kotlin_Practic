// run() work  {run is combination of let and with ,the return value is "lambda result",refer to context object by using" this"}
// if you want to operate on a Nullable object and avoid NullPointerException use run().
class Animal2(){
    var name:String= "cat"
    var age: Int= 3
}
fun main(){
    val animal: Animal2 ? = Animal2()

    val newAge=animal?.run {             //call ?. safe call, means if the animal is null not to print the properties
        println(this.name)
        println(this.age)
        age+5
    }
    println("newAge:$newAge")
}
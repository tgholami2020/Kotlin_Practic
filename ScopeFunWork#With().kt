
class Person3{
    var name= "ahmad"
    var age= 30

}
fun main(){
    val person= Person3()
    println(person.name)
    println(person.age)

    //With() working  { refer to context object by "this", the return value is a "lambda result"}
    val ageAfterFiveYears: Int=with(person){
        println(name)
        println(age)
        age+5             //print it as a last statement of lambda in ageAfterFiveYears variable
    }
    println("age after 5 years: $ageAfterFiveYears")
}
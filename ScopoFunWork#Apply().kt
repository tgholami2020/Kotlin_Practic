class Person4{
    var name= ""
    var age= 0
}
fun main(){
    // apply() work  { refers to context object by using "this", the return value is "context object" }
    val person= Person4().apply {
        this.name= "Ahmad"
        this.age=30
    }
    //use with() to print 
    with(person){
        println(name)
        println(age)
    }

}
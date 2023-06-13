
fun main(){
    val name= "ali"
    val lastName="Gholami"
    val combine= StringBuilder()
    combine.append(name).append(lastName)
    val completeName = combine.toString()
    println("$name $lastName")             //1
    println( name +  lastName)             //2
    println(completeName)                  //3
    
}
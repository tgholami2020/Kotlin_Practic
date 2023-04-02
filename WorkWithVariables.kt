
data class WorkWithVariables(var age:Int){
    val name: String ="Rea"       //val can not be change it is immutable
    var email: String=""          // var can bee changed it is mutable
}

fun main(){
    val printData= WorkWithVariables(30)
    printData.email=" tis is new email: tahere.gholami67@gmail.com"
    println(printData.email)
    println(printData.name)
    println(printData.age)
}
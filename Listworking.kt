class ListWorking {
    var nameOfStudents = mutableListOf("Ali","Ahmad","Mahmod","zahra")
    var firstName= nameOfStudents.first()

}


fun main(){
val listwork= ListWorking()
    listwork.nameOfStudents
    println("names are : ${listwork.nameOfStudents}")
    println("first name is : ${listwork.firstName}")
    var nameOfStudents = mutableListOf("Ali","Ahmad","Mahmod","zahra")
    nameOfStudents.add("Tahira")
    println(nameOfStudents)
    nameOfStudents.remove("Ali")
    nameOfStudents.removeAt(2)
    println(nameOfStudents)

}
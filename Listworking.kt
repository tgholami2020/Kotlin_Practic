class ListWorking {
    var nameOfStudents = mutableListOf("Ali","Ahmad","Mahmod","zahra")      //mutable list of students
    var firstName= nameOfStudents.first()                                   //fist name store here

}


fun main(){
    //make object of class
val listwork= ListWorking()
    //printing list of students+
    println("names are : ${listwork.nameOfStudents}")
    println("first name is : ${listwork.firstName}")
    var nameOfStudents = mutableListOf("Ali","Ahmad","Mahmod","zahra")
    nameOfStudents.add("Tahira")                                            //add one student to the list
    println(nameOfStudents)
    nameOfStudents.remove("Ali")                                    //remove first student from list
    nameOfStudents.removeAt(2)                                        //remove index 2 from list
    println(nameOfStudents)

}
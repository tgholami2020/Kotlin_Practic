
//finding a name through a list
class Person2 ( val name:String,val studentList:List<String>){


    fun memberOf() {
        val findName = name
        for (i in studentList) {
            if (i == findName) {
                println(true)
            } else {
                println(false)

            }
        }
    }
}
fun main(){
    //assign list of student to variable list
    var list= listOf("zahra","Tahira","sara")

    //assign Person2 class to variable myperson
    val myPerson= Person2("Tahira",list)

    //print the all list value
    list.forEach {mylist->
        println(list)
    }
    myPerson.memberOf()
}
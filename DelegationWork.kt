import kotlin.reflect.KProperty

class Student{
    var firstName: String? by NameDelegate()
    var lastName: String? by NameDelegate()

    //for printing the values
    override fun toString(): String {
        return "$firstName $lastName"
    }
}
//class that we delegate from it
class NameDelegate{
    var formattedValue :String?= null

    //set value
    operator fun setValue(
        thisRef: Any?,                           //calling object
        property: KProperty<*>,
        value: String?
    ){
        if (value != null && value.length > 5) {
            formattedValue = value.trim().toUpperCase()
        }
    }
    //get the value
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String?{
        return formattedValue
    }
}


    fun main(){
        var student= Student()
        student.firstName ="Tah"
        student.lastName ="Gho"
        println(student)
}





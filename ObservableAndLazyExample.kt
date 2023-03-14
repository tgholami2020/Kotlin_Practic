import kotlin.properties.Delegates

class StudentHeavy{
    init {
        println("Student Heavy initialized ")
    }
}

class Student1{
    val heavy  by lazy { StudentHeavy() }                  //when a value is not necessary use lazy

    var marks: Int by Delegates.observable(50){property, oldValue, newValue ->        //using Delegate Observable property
        println("old Value $oldValue")
        println("new Value $newValue")
    }
    
    var age: Int by Delegates.vetoable(14){property, oldValue, newValue ->            //using delegate vetoable
        println("newAge $newValue")
        println("oldAge $oldValue")
        newValue >= 14
    }
}

fun main(){
    val student= Student1()
     student.marks= 70
     student.marks=80

    student.age = 13
    println(student.age)
    student.age=12
    println(student.age)
    student.age=15
    println(student.age)

}
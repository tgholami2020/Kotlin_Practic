

class Person(val firstName:String="Ali", val secondName:String="Gholami") {
    var nickName:String?= null
        set(value) {
            field = value
            println(" this is the new nickname : $value")
            }
        get() {
            println("the returned nickname is :$field")
            return field
        }
    //woek with method
    fun PrintInfo(){
        var nickNametoPrint=nickName ?: "no nickName"
        println("$firstName ($nickNametoPrint) $secondName")
    }
}
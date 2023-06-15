
fun main(){

    var obj: Any
    obj= 165

    // is
    if(obj !is String){
        println("this is  not a string variable")
    }else if (obj is Int){
        println(" this is an Integer ")
    }

    //as !as
    //unsafe cast operator
    var abc: Any?=null
    var def:String = abc as String
    println(def)


    //safe cast operator
    var obj1: Any? = null
    var obj2: Int? = obj1 as? Int

    println(obj2)

}
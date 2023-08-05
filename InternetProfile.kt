fun main(){
    val amanda=Person5("Amanda",33,"Play Tennis",null)
    val ali= Person5("Ali",24,"Football",amanda)
    amanda.showProfile()
    ali.showProfile()
}
class Person5(
    val name:String,
    val age:Int,
    val hobby: String?,
    val referred :Person5?
){
    fun showProfile(){
        println("Name: $name")
        println("Age: $age")
        if (hobby!=null){
            print("Likes to $hobby.")
        }
        if (referred != null){
            print("Has a referrer named: ${referred.name}")
            if(referred.hobby!= null){
                print(", Who likes to ${referred.hobby}.")
            }else{
                print(".")
            }
        }else{
            print("Does not have a referrer.")
        }
        print("\n\n")
    }
}
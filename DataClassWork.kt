

 data class User (val name:String,val id: Int){  //when we use "data" then the value of each object will compared
}

fun main(){
    //same values but not same references
    var user1= User("sara", 10)
    var user2= User("sara",10)

        if (user1 == user2){        //user1 and user2 are in different heap but same value
            println("Equal")
        }else{
            println("not Equal")
        }
    println(user1.toString())       //we can use toString() by default
    println(user2)

    var newUser= user1.copy(name="taha", id = 88)       //kotlin creates copy() too
    println(newUser)
}
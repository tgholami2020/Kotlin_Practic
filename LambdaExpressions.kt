
fun main(){
    val coins: (Int)-> String={ it->
        "$it quarters"
    }
    val cupCake:(Int)-> String={it->
        "Have a cupcake"
    }
    val treatFunction= trickOrTreat(false, { "$it quarters" })               //remove coins name and write lambda expression instead
    val trickFunction= trickOrTreat(true,null)
    //repeat() is a higher order function that work like a loop
    repeat(4){
        treatFunction()
    }
    trickFunction()
}
// a function can return another function/pass function as an argument
fun trickOrTreat(isTrick: Boolean,extraTreat:((Int)-> String)?):() -> Unit{
    if(isTrick){
        return trick
    }else{
        if (extraTreat!=null){
            println(extraTreat(5))
        }
        return treat
    }
}
val trick={
    println("No treads!")
}
//use functions as data type
val treat:() ->Unit ={
    println("Have a treat!")
}
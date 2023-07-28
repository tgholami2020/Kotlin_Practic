
fun main(){
    val myAge= 34
    val isTeenager=  myAge<19 && myAge>13                   //is the age is between 13 and 19?
    println("$isTeenager")                                  //print false
    
    val theirAge= 18
    val bothTeenager= theirAge<19 && theirAge>13

    println("$bothTeenager")                                //print true

    val reader="Tahira"
    val author="Richard Lucas"
    val authorIsReader= reader== author

    println(authorIsReader)                                //print false



}
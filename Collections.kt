fun main(){
    val myListOfNames= listOf("ali","Reza","Taha","Ava")             //cant add new element
    val mutableOfNumbers= mutableListOf(12,45,67,78)
    mutableOfNumbers.add(333)                                        //you can add new element
    println(mutableOfNumbers)

    val mySet= mutableSetOf(1,2,3,4)
    println(mySet)
    println(mySet.add(4))                 //in the set we cant have repeated value

    val myMap= mutableMapOf("Up" to 1,
        "Down" to 2,
        "Left" to 3,
        "Right" to 4)
         myMap["Center"]=5                  //here is how to add new key,value in the map
        println(myMap)

    //initializing Collections
    val myNewList= mutableListOf<String>()
    myNewList.add("Ali")
    for(i in 1..10){
        myNewList.add("hey $i")
    }
    println(myNewList)

    //empty Collections
    val empty= emptyList<String>()
    val emptySet= emptySet<Int>()
    val emptyMap= emptyMap<String,Int>()

    //filter make a new list from existing list,filter is case-sensitive
    val listOfNames= listOf("Ali","Reza","Taha","Ava")
    val found=listOfNames.filter {
        //it.length>3                            //[Reza, Taha]
        //it.endsWith("a")                       //[Reza, Taha,Ava]
        it.startsWith("a",ignoreCase = true && it.endsWith("A",ignoreCase = true))                 //[Ava]
    }
    println(found)

}

fun main(){
    //working with array
    val names =arrayOf<String>("Sakina","Razia","Tahira","Amir","Zahra")
    println(names[0])
    names[3]="Amir Taha"
    println(names[3])
    names[4]="Ali"
    println(names[4])
    for (myName in names){
        println( " list of names are : $myName" )
    }
    //working with list
    val solarSystem = mutableListOf<String>("Mercury", "Venus", "Earth")
    println(solarSystem.size)

    println(solarSystem.get(1))                   //finding value by index number
    println(solarSystem.indexOf("Earth"))         //finding index by value
    println(solarSystem.indexOf("Tahira"))        //return -1 if nothing found in the list
    solarSystem.add(0,"tahira")      //add element to the list
    solarSystem.removeAt(2)                 //remove an element from list
    println("ali" in solarSystem)                 //return false if no such element found

    for (planet in solarSystem){
        println(planet)
    }
}
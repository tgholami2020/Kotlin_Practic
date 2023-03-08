

fun main(){
    var interestingThings= arrayOf("kotlin","programming","android")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(2))

    //work  with forEach
    interestingThings.forEach {
        println(it)
    }
    //other way
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }

    //getting each index of array
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }

}
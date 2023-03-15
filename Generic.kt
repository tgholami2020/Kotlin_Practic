
class MyArray<E>(val array: Array<E>){                      //define array type generic 

    //write a fun to search element through  an array
    fun findElement( element: E, fundElement:(index:Int, element:E?)-> Unit){
        for (i in array.indices) {
            if (array[i] == element) {
                fundElement(i, array[i])
                return
            }
        }
        fundElement (-1,null)
        return
    }
}
fun main(){
    val myArray= MyArray<Int>(arrayOf(1,2,3,4,5))                   //one instance for int
    val myArray1= MyArray<String>(arrayOf("1","2","3","4","5"))     //one instance for string
    myArray.findElement(3){index, element ->
        println("Index $index")
        println("Element $element ")
    }
    myArray1.findElement("5"){index, element ->
        println("Index $index")
        println("Element $element")
    }
}
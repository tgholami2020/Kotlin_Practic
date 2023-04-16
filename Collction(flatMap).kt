
fun main(){
    val fruitsBag= listOf("apple","pear","peach")
    val clothsBag= listOf("shirts","pans","jeans")
    val cart= listOf(clothsBag,fruitsBag)
    val bagMap= cart.map { it }
    val flatMapBag= cart.flatMap { it }

    println("fruits bag are: $fruitsBag")
    println("cloths bag are: $clothsBag")
    println("cart have : $cart")                    //put two lists of fruits and cloths in cart
    println("bagmap is : $bagMap")                  //put two lists of carts in bag map
    println("flat map bag are: $flatMapBag")        //makes two lists in one single list
}
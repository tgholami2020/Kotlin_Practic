
fun main(){
        //Using Fold
        val totalPrice= cookies.fold(0.0){ total, cookie ->
            total + cookie.price
        }
        println(" The total price is: $${totalPrice}")

        //Using Map
        val fullName= cookies.map {
            "${it.name} - $${it.price}"
        }
        println("fullName")
         fullName.forEach {
          println(it)
    }
         //Using Filter
        val softBakedMenu= cookies.filter {
        it.softBaked
    }
         println("soft Cookies")
         softBakedMenu.forEach{
         println( "${it.name} : $${it.price}")
    }
    }
class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)
val cookies = listOf(
    Cookie(
        name = "Chocolate Chips",
        softBaked = true,
        hasFilling = false,
        price = 4.33
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 7.12
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    )
)
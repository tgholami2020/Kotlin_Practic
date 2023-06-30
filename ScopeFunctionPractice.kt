

fun main(){
 var number: Int = 2
    val x= number?.let {
        val number2 = it +1
        number2
    } ?: 3
    fun getSquaredI()=(number*number).also {
        number++
    }
    number.run {
        number =3
    }
    println(number)
    println(x)
    println(getSquaredI())
}
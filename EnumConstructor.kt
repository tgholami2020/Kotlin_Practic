import CreditType.*


interface ICardCasBack{
    fun getCashBack(): Float
}


enum class CreditType(val color:String,val maxLimit:Int= 1000000) :ICardCasBack{                 //enum class can inherit interface
    //enum constants
    SILVER("gray", 5000) {               //ordinal 0      //name "SILVER"
        override fun getCashBack(): Float = 0.02f
    },
    GOLD("gold") {                              //ordinal 1      //name  "GOLD"
        override fun getCashBack(): Float = 0.04f
    },
    PLATINUM("black") {                        //ordinal 2      //name  "PLATINUM"
        override fun getCashBack(): Float =0.06f
    }
}
fun main(){
    println(CreditType.PLATINUM.color)               //black
    println(CreditType.GOLD.getCashBack())           //0.04
}



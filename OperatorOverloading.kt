
fun main(){
val handler= Handlers()                                                 //constance of handler class
    println(handler())
    println(handler(4343))
    println(handler("this is a string"))
    println("*********************")
    val someText= SomeText("some value right here")               //constance of data class SomeText
    println(+someText)
    println(-someText)
    println(!someText)
    println("*********************")
    var customPoint= CustomPoint(0,0)                             //constance of data class CustomPoint
    println(customPoint++)
    println(++customPoint)
    println(customPoint)
    println(--customPoint)
    println(customPoint--)
    println(customPoint)
    println("*********************")
    val textA=SomeText("123")
    val textB=SomeText("456")
    println(textA < textB)
    println(textA > textB)
    println(textA <= textB)
    println(textA >= textB)

}
class Handlers(){
    operator fun invoke()= " some String"
    operator fun invoke(id: Int)= "some id $id"
    operator fun invoke(stringValue: String)= "some more string : $stringValue"
}
data class SomeText(
    val value:String
){
    operator fun unaryPlus(): SomeText=
        SomeText(this.value.uppercase())

    operator fun unaryMinus(): SomeText=
        SomeText(this.value.lowercase())

    operator fun not(): SomeText=
        SomeText((this.value.reversed()))

    operator fun compareTo(otherValue: SomeText): Int{
        val thisLength= this.value.length
        val otherValueLength= otherValue.value.length
        return thisLength - otherValueLength
    }
}
data class CustomPoint(
    val x: Int,
    val y: Int
){
    operator fun inc(): CustomPoint=
        CustomPoint(this.x + 1,this.y + 1)

    operator fun dec(): CustomPoint=
        CustomPoint(this.x - 1,this.y - 1)
}


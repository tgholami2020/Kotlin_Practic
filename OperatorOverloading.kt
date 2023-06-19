
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

class Box(){
    val height : Int=10
    val width : Int=20
    val length : Int=5

    val volume                            //getter
        get() = height*width*length       //getter
        var boxName : String = "box name"
            set(value) {                  //setter
                if (value.length<3){
                    println("th name cannot be less than 3")
                }else{
                    field=value
                }
            }

    fun fillContent(){
        println("Box is filled")
    }
}

fun main(){
    val box1= Box()

    println("height : ${box1.height}")
    println("width : ${box1.width}")
    println("length : ${box1.length}")
    println("volume : ${box1.volume}")
    box1.boxName= "b"
    println("barcode: ${box1.boxName}")
    box1.fillContent()
}
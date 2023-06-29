

fun main(){
val data= getData()
    data.apply {
        this.name= "tahira"
        id= 434
    }
    data.also {
        it.name="Tahira Gholami"
    }
    with(data){
        println(this.name)
        println(this.id)
    }
}

class getData{
   var name= ""
   var id= 12
}
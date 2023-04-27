import javax.swing.text.StyledEditorKit.BoldAction

class Birds{
    var name: String?=""
    var size: String=""
    var lsInGroup: Boolean= false
    var isSing: Boolean= false
}

fun main(){

 var birds= Birds().apply {
     this.name = " Eagle"
     this.lsInGroup = true
     this.size = "small"
     this.isSing = false
 }
     with(birds){
         println(name)
         println("the sie of this bird is :$size")
         println("they live in group :$isSing")
         println("they can not sing :$lsInGroup")

     }
    birds.also {
        it.name=" Duck"
        println("new name of bird is: ${it.name}")
    }
    val name: String?="Duck"
   val nameLength= name?.let{
       println(it.length)
   }
 }

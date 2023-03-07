import java.awt.AWTEventMulticaster.add
import kotlin.math.max

fun main(args:Array<String>) {
   val person= arrayOf("alit","reza","sara")
   for (i in person){
      if (i== "ali"){
         println(i)
      }else
         println("ali is not in the list")
   }


   //work with map
   val nameOfMyScore = mutableMapOf(
      "Name" to "Tahira",
      "familyName" to "Gholami",
      "Age" to "thirthy three"
   )

   println(nameOfMyScore)
   println(nameOfMyScore.isEmpty())
   println(nameOfMyScore.size)

}





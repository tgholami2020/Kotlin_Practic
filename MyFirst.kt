@file:JvmName("myKotlinFile")                      //annotation for naming kotlin file
 fun main(){
    val area=MyJavaFile.findArea(4,5)              //calling java method inside kotlin file
     println("printing Area from java class $area")
 }

 fun add( a: Int, b: Int): Int{
     return a + b
 }
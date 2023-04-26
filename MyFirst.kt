@file:JvmName("myKotlinFile")
 fun main(){
    val area=MyJavaFile.findArea(4,5)
     println("printing Area from java class $area")
 }

 fun add( a: Int, b: Int): Int{
     return a + b
 }
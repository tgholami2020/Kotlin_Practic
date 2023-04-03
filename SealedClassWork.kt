

sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var side: Int) : Shape()
    object notShape: Shape()

}

//write one subclass outside  sealed class
class Rectangle(var length: Int,var breadth: Int): Shape()

//a function to find the area by using when statement
fun checkShape(shape: Shape){
    when(shape){
        is Shape.Circle-> println("Circle Area is : ${3.14* shape.radius * shape.radius} ")
        is Shape.Square-> println("Square Area is : ${shape.side * shape.side}")
        is Rectangle-> println("Rectangle Area is : ${shape.length * shape.breadth}")
        Shape.notShape -> println("No shape found")
        else -> println(" it is not a shape")
    }
}
fun main(){
    var circle= Shape.Circle(0.8f)
    var square= Shape.Square(4)
    var rectangle= Rectangle(3,8)

    checkShape(circle)
    checkShape(square)
    checkShape(rectangle)

    var noShape= Shape.notShape
    checkShape(noShape)

}
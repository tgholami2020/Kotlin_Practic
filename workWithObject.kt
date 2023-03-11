

fun main(){
    //access to "object" variable and method without making object of it.
    Book.bookName = "new Java programming"
    Book.readBook()
    println(Book.bookName)
    println(Book.readBook())
    //access to " companion object" variable and method without making object of it.
    NewBooks.bookName2 ="kotlin programming"
    NewBooks.bookName2
    println(NewBooks.bookName2)
    println(NewBooks.readBook2())

}
// companion object is used inside a class
class NewBooks(){
    companion object{
        var bookName2 : String = "java"

        fun readBook2():String{
            return "it is not readed yet"
        }
    }
}
// object is use like static classes,methods and properties
object Book{
    var bookName : String = "java"

    fun readBook():String{
        return "it is readed"
    }
}
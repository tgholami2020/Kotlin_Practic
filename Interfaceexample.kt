
fun main(){
    val button= Button("Button")
    button.ClickEvent("I am a Button")

    val superMario= Character("super Mario")
    superMario.ClickEvent("I am a great actor")

}
// Interfaces does not have implementation
interface ClickEvent {
    fun ClickEvent(message:String)
}
//Button class implements the ClickEvent Interface
class Button(val lable: String): ClickEvent{
    override fun ClickEvent(message: String) {
       println("Clicked by $lable and here is a message $message")
    }

}
//Character class implements the ClickEvent Interface
class Character(val name:String): ClickEvent{
    override fun ClickEvent(message: String) {
        println("Clicked by $name and here is the message $message")
    }

}
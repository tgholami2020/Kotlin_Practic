
fun main(){
    val question1= Question<String>("What is the ambivalent means?","having mix feeling",Difficulty.EASY)
    val question2= Question<Boolean>("Is the sky green?",false,Difficulty.MEDIUM)
    val question3= Question<Int>("Count the numbers of march month?",3,Difficulty.HARD)
    println(question1.toString())
    println(question2)
    println(question3)
}
data class Question<T>(
    val questionText:String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty{
    EASY,
    MEDIUM,
    HARD
}

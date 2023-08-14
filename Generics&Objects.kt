
fun main(){
  println(Quiz.printProgressBar())
}
val Quiz.StudentProgress.progressText: String            //add an extension property
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar(){
    repeat(Quiz.answered) {print("*")}
    repeat(Quiz.total - Quiz.answered) {print("0")}
    println()
    println(Quiz.progressText)
}

class Quiz{
    val question1= Question<String>("What is the ambivalent means?","having mix feeling",Difficulty.EASY)
    val question2= Question<Boolean>("Is the sky green?",false,Difficulty.MEDIUM)
    val question3= Question<Int>("Count the numbers of march month?",3,Difficulty.HARD)

    companion object StudentProgress{
        var total : Int= 10
        var answered :Int=3
    }
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


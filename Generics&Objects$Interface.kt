
fun main(){
    val quiz= Quiz()
    quiz.printQuiz()
   // Quiz().printProgressBar()
}
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable{
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there on march month?", 28, Difficulty.HARD)

    override val progressText: String
        get() = "${answered} of ${total} answered"

    override fun printProgressBar() {
        repeat(Quiz.answered) {print("*")}
        repeat(Quiz.total - Quiz.answered) {print("0")}
        println()
        println(progressText)
    }
    companion object StudentProgress{
        var total : Int= 10
        var answered :Int=3
    }
    fun printQuiz(){
        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            }
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
            }
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }

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


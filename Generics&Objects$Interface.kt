
fun main(){
  Quiz().printProgressBar()
}
interface ProgressPrintable{
    val progressText: String
    fun printProgressBar()
}

class Quiz : ProgressPrintable{
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


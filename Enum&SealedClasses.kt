
import java.io.IOException
import kotlin.Error

fun main (){
    Repository.startFetch()
    getResult(Repository.getCurrentState())

    Repository.finishFetch()
    getResult(Repository.getCurrentState())

    Repository.error()
    getResult(Repository.getCurrentState())

    Repository.anotherCustomFailure()
    getResult(Repository.getCurrentState())

    Repository.customFailure()
    getResult(Repository.getCurrentState())

}
fun getResult(result: Result){
    return when(result){
        is Error -> {
            println(result.message.toString())
        }
        is Success -> {
            println(result.dataFetched ?: "Ensure you start the fetching")
        }
        is Loading -> {
            println("Loading...")
        }
        is NotLoading -> {
            println("Idle ")
        }
        is Failure.AnotherFailureException ->{
            println(result.anotherFailureException.toString())
        }
        is Failure.CustomFailure ->{
            println(result.customFailure.toString())
        }
        else -> {}
    }
}
//make an object class tells compiler that is a singleton and one instance is allowed
object Repository{

private var loadState: Result =  NotLoading
private var dataFetched : String?= null

    fun startFetch(){
        loadState = Loading
        dataFetched ="data"
    }
    fun finishFetch(){
        loadState = Success(dataFetched)
        dataFetched = null
    }
    fun error(){
        loadState = Error(exception= Exception("Exception"))
    }
    fun getCurrentState(): Result{
        return loadState
    }
    fun anotherCustomFailure(){
        loadState=Failure.AnotherFailureException(anotherFailureException = java.lang.NullPointerException("some this went wrong"))
    }
    fun customFailure(){
        loadState= Failure.CustomFailure(customFailure = IOException("custom failure"))
    }
}

sealed class Result 
    data class Success(val dataFetched: String?) : Result()
    data class Error(val exception: Exception) : Result()
    object NotLoading : Result()
    object Loading : Result()



sealed class Failure :Result(){
    data class CustomFailure(val customFailure: IOException): Failure()
    data class AnotherFailureException(val anotherFailureException: NullPointerException):Failure()

}
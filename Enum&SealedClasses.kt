
fun main (){
    Repository.startFetch()
    getResutl(Repository.getCurrentState())

    Repository.finishFetch()
    getResutl(Repository.getCurrentState())

    Repository.error()
    getResutl(Repository.getCurrentState())

}
fun getResutl(result: Result){
    return when(result){
        Result.SUCCESS -> println("Success!")
        Result.FAILURE -> println("Failure!")
        Result.ERROR -> println("Error!")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading...")
    }
}
//make an object class tells compiler that is a singleton and one instance is allowed
object Repository{

private var loadState: Result =Result.IDLE
private var dataFetched : String?= null

    fun startFetch(){
        loadState = Result.LOADING
        dataFetched ="data"
    }
    fun finishFetch(){
        loadState = Result.SUCCESS
        dataFetched = null
    }
    fun error(){
        loadState = Result.ERROR
    }
    fun getCurrentState(): Result{
        return loadState
    }
}

enum class Result{
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}

fun main(){
    //you can name the arguments ot update the values
calculate(first = 0,second= 200, message = "is multiple of", multipleOf =20)
}
fun calculate(
    first: Int=0,                           //add parameters to function
    second: Int= 200,
    message:String,
    multipleOf: Int){
    for (i in first.. second){
        if(i % multipleOf ==0){
            println("$i $message $multipleOf")
        }
    }
}
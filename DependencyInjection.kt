
fun main(){
    val engine= Engine()
    val turbo= TurboEngine()
    val car4= Car4(engine,turbo)

    car4.startCar()
    car4.engine.start()
    car4.turbo.start()
}
class Engine(){
    fun start(){ println("the engine is started")
    }

}
class TurboEngine(){
    fun start(){
        println("Turbo engine start...")
    }
}
class Car4(val engine:Engine,val turbo: TurboEngine){
    fun startCar(){
        println("starting car...") }
}

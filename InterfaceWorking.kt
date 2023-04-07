
fun main(){
    var myBtn= myFirstInterface.mySecondInterface.MyButton()
    myBtn.OnTouch()
    myBtn.Onclick()
}

interface myFirstInterface {                        //you cant create instance of interface
    fun Onclick()                                   //methods in interface are abstract by default
    fun OnTouch() {                                 //normal methods are public and open by default but not final
        println("the 1 interface is touched!")
    }

    interface mySecondInterface {
        fun Onclick()
        fun OnTouch() {
            println("the 2 interface is touched!")
        }

        class MyButton : myFirstInterface,mySecondInterface{               // we can inherit multiple interfaces
            override fun Onclick() {
                println("the button is clicked")
            }

            override fun OnTouch() {
                super<myFirstInterface>.OnTouch()                          //call specific interface method like this when you have same method name
                super<mySecondInterface>.OnTouch()                         //call specific interface method like this when you have same method name
                println("i am touched from my class myButton")
            }


        }
    }
}
package designpatterns.builder

data class PhoneKt (
    var os : String = "Android",
    val processor : String = "Snapdragon",
    val battery : Int = 0,
    val screenSize : Double = 0.0 ,
    val camera : Int = 0
        )

fun main(){
    val p  = PhoneKt(screenSize = 10.0, camera = 0)
    println(p.battery)
    println(p.screenSize)
}
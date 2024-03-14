import java.security.spec.ECFieldF2m

fun main() {
    //Predefined Functions
    println("Hello Kotlin")

    var x = Math.min(78,56)
    println(x)

    var y = Math.max(90,156)
    println("The largest value is $y")

    var z = Math.round(45.98)
    println(z)

    //Calling a function
    name()
    product(6,7)
    details("Joe",32)
}

    //User-defined function
fun name(){
    println("Roy")
}

fun product(num1:Int, num2:Int){
    println(num1 * num2)
}

fun details(name:String,age:Int){
    println("$name is $age years old.")
}
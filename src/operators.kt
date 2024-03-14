fun main() {
    //Arithmetic operators
    var num1 = 45
    var num2 = 34

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1.toDouble() / num2)
    println(num1 % num2)

    //Comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)
    println(num1 != num2)

    //Logic operators - and , or , not
    println(num1 < num2 && num1 != num2)  //And
    println(num1 < num2 || num1 != num2)  //Or
    println(!(num1 < num2 || num1 != num2))  //Not

    //Assignment operators
    var x = 23
    x += 2
    println(x)

    var y = 45
    y %= 2
    println(y)
}
fun main() {
    //While loop
            //increment
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
            //decrement
    var x = 100
    while (x >= 95){
        println("Counter is $x")
        x--
    }

    //Do...while loop
    var num = 20
    do {
        println(num)
        num++
    }while (num <= 25)

    //for loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }

    var marks = arrayOf(97,87,100,85,99)
    for (mark in marks){
        println("Mark is $mark")
    }

    //Range
    for (number in 30..35){
        println(number)
    }

    for (letter in 'a'..'d'){
        println("Letter is $letter")
    }
}
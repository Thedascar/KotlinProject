package bookAndW3School

fun main(){
    // Kotlin if
    // Use if to specify a block of code to be executed if a condition is true.

    // Syntax
    if (20 > 18) {
        println("20 is greater than 18")
    }
    // using variable
    var x = 20
    var y = 18
    if (x > 18){
        println("20 is greater than 18 with variables")
    }

    // Kotlin if and else
    // Use else to specify a block of code to be executed if a condition is false
    // Syntax

    val time = 15
    if (time < 18){
        println("less than 18")
    } else{
        println("more greater than 18")
    }

    // Kotlin else if
    // Use else if to specify a new condition if the first condition is false.

    val timeDay = 19
    if (timeDay <= 12){
        println("Good Morning")
    }else if (timeDay < 18){
        println("Good Afternoon")
    }else{
        println("Good Night")
    }

    //Kotlin If..Else Expressions
    //In Kotlin, you can also use if..else statements as expressions (assign a value to a variable and return it):

    val timer = 20
    val greeting = if (timer < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)
}
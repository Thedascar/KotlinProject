package bookAndW3School

fun main() {

    //Kotlin While Loop
    //The while loop loops through a block of code as long as a specified condition is true:

    var i = 0
    while (i <= 5) {
        println(i)
        i++
    }

    // The Do..While Loop
    //The do..while loop is a variant of the while loop. This loop will execute the code block once,
    //before checking if the condition is true, then it will repeat the loop as long as the condition is true.

    var y = 0
    do {
        println("Dentro do do-while $y")
        y++
    }while (y <= 5)
}
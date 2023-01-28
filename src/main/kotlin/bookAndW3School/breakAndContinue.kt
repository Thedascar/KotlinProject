package bookAndW3School

fun main(){

    //Kotlin Break
    //The break statement is used to jump out of a loop.

    var i = 0
    while (i <= 10){
        println("Break " + i)
        i++
        if(i == 4){
           break
        }
    }

    //Kotlin Continue
    //The continue statement breaks one iteration (in the loop), if a specified condition occurs,
    //and continues with the next iteration in the loop.

    var y = 0
    while (y <= 5){
        if(y == 4){
            y++
            continue
        }
        println("Continue " + y)
        y++
    }
}
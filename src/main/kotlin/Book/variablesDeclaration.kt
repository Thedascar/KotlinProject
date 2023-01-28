package Book

fun main() {
   // Declaration in kotlin
   // using var ou val , var can be changed and val cannot..
    // kotlin's type is auto..

    var name = "Bob" // String
    name = "Lucas"
    val ageYear = 1975 // int
    // ageYear = 1975 not able to change
    // there are another types
    var salary = 1578.45 // double type
    var isRich = false // boolean type

    // it is possible specify the type...
    val name2: String = "Aline"
    val ageYear2: Int = 1985
    var salary2: Double = 5878.56
    val isRich2: Boolean = false

    //display the values println() <- always using the next line down
    // print() concatenate in the same line
    // 2 methods of print... with + or ${} <- more usual
    println("Hello My name is " + name)
    println("My age is " + ageYear)
    println("My salary is " + salary)
    println(isRich)
    println()
    println("Hello My name is ${name2}")
    println("My age is ${ageYear2}")
    println("My salary is ${salary2}")
    println(isRich2)

    // numerical is usefull here..

    val n1 = 10
    val n2 = 5
    println("Its sum is " + (n1 + n2))

}

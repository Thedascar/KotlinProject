package bookAndW3School
fun main() {

    //Kotlin Functions
    //A function is a block of code which only runs when it is called.
    //You can pass data, known as parameters, into a function.
    //Functions are used to perform certain actions, and they are also known as methods.]


    fun myFirstFunction(){
        println("My first Function, i write this")
    }

    // Call the function
    myFirstFunction()

    //Function Parameters
    //Information can be passed to functions as parameter.
    //Parameters are specified after the function name, inside the parentheses. You can add as many parameters as you want,
    // just separate them with a comma. Just note that you must specify the type of each parameter (Int, String, etc).
    //The following example has a function that takes a String called fname as parameter.
    // When the function is called, we pass along a first name, which is used inside the function to print the full name:

    fun myNameIs(fname : String,age : Int) {
        println("My name is $fname and i've just had $age years old")
    }

    myNameIs("Lucas", 28)
    myNameIs("Aline", 25)
    myNameIs("Bob", 10)
    myNameIs("Bacon", 7)

    //Return Values
    //In the examples above, we used functions to output a value. In the following example,
    // we will use a function to return a value and assign it to a variable.
    //To return a value, use the return keyword, and specify
    // the return type after the function's parantheses (Int in this example)

    fun returnSum(n1: Int, n2: Int) {
        return println("The sum is " + (n1 + n2))
    }

    returnSum(10, 20)

    // Shorter Syntax for Return Values
    //There is also a shorter syntax for returning values. You can use the = operator instead of return without specifying the return type.
    // Kotlin is smart enough to automatically find out what it is:

    fun myFunction(x: Int, y: Int) = x + y

    var result = myFunction(3, 5)
       println(result)



}
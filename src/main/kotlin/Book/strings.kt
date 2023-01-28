package Book

fun main() {
    // Kotlin Strings
    // Strings are used for storing text.
    // A string contains a collection of characters surrounded by double quotes:

    var newMessage = "Hello World"

    var greetings: String
    greetings = "Hy World"

    // Access a String
    // to access the elementes you must refer to index
    var txt = "Hello World"
    println(txt[0])
    println(txt[6])

    // String Length
    var grandText = "i've been studying kotlin a week"
    println("${grandText.length} words")

    // String Functions
    // There are many string functions available, for example toUpperCase() and toLowerCase():
    println(txt.toUpperCase())
    println(txt.toLowerCase())

    // Comparing Strings
    // The compareTo(string) function compares two strings and returns 0 if both are equal or -1:
    var a1 = "none"
    var a2 = "none2"
    println(a1.compareTo(a2))

    // Finding a String in a String
    // The indexOf() function returns the index (the position) of the first
    // occurrence of a specified text in a string (including whitespace):

   var txt3 = "i have two dogs, terrible dogs"
    println("this position is : " + txt3.indexOf("terrible"))

    // String Templates/Interpolation
    // Instead of concatenation, you can also use "string templates", which is an easy way to add variables and expressions inside a string.
    // Just refer to the variable with the $ symbol:

    var firstName = "Lucas"
    var lastName = "Ramon"
    println("My name is $firstName and my last name is $lastName")
}

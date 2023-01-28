package Book

fun main(){

    //auto type
    val myNum = 5             // Int,Long,Short
    val myDoubleNum = 5.99    // Double,Float
    val myLetter = 'D'        // Char,or Byte -128 to 127
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    // types are declared
    val myNum2: Int = 5                // Int,Long,Short
    val myDoubleNum2: Double = 5.99    // Double,Float
    val myLetter2: Char = 'D'          // Char,or Byte -128 to 127
    val myBoolean2: Boolean = true     // Boolean
    val myText2: String = "Hello"      // String

    // To convert a numeric data type to another type, you must use one of the following
    // functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    var x = 10
    var y = 10.toDouble()
    println(" x $x or converte($y)")

}
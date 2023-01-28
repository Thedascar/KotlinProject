package bookAndW3School

fun main(){
    //Kotlin Arrays
    //Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.
    //To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:
    var car = arrayOf("Gol","Bmw","Ford","Fiat")
    println(car[0])

    // Change an Array Element
    car[0] = "New Polo"
    println("Changed " + car[0])

    // Array Length / Size
    //To find out how many elements an array have, use the size property:
    println(car.size)

    // Check if an Element Exists
    //You can use the in operator to check if an element exists in an array
    if ("Ferrari" in car){
        println("Exist")
    }else{
        println("Not Exist")
    }

    // Loop Through an Array
    //Often when you work with arrays, you need to loop through all of the elements.
    //You can loop through the array elements with the for loop, which you will learn even more about in the next chapter
    //The following example outputs all elements in the cars array:

    for (cars in car){
        println("Cars in the list $cars")
    }
}
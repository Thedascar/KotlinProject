package bookAndW3School

fun main(){

    //Kotlin For Loop
    //Often when you work with arrays, you need to loop through all of the elements.
    //To loop through array elements, use the for loop together with the in operator:
    var games = arrayOf("Gow","Need","Spider-man","Tlol")
    for (game in games){
        print(game)
        print(",")
    }

    var numbers = arrayOf(1,10,58,789,45,78,45)
        for(number in numbers) {
            print(number)
            print(",")
        }

}
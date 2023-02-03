package KotlinOO
fun main(){
    val lucas = Human()
    lucas.name = "Lucas"
    val dog = Dog()
    dog.owner = lucas
    dog.name = "Bob"
    dog.sayHi()

    val aline = Human()
    aline.name = "Aline"
    dog.owner = aline
    dog.sayHi()
}
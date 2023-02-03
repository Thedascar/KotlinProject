package KotlinOO

class Dog{
    var name: String? = null
    var owner: Human? = null
    fun sayHi() {
        println("Hello my owner is ${owner?.name} and my name is $name")
    }
}
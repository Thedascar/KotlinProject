package bookAndW3School

fun main(){
    // Reference
    var x = 10
    var y = x
    y++
    println(x)
    println(y)
    //value
    val car1 = Carro("Gol")
    val car2 = car1
    car2.carro = "gol"
    car1.carro = "Fiat"

    println(car1.carro)
    println(car2.carro)

    // Strings

    var palavra = "palavra"
    var palavraNova = palavra
    palavraNova = "palavraNova"
    val substring = palavra.substring(4)

    println(palavra)
    println(palavraNova)
    println(substring)

    for(c in palavra){
        println(c)
    }




}

class Carro(
    var carro: String
)
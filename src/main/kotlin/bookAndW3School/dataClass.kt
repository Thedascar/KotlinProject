package bookAndW3School

fun main(){
    val lucas = Pessoa(nome = "Lucas",idade = 27)
    val lucas2 = Pessoa(nome = "Lucas",idade = 27)


    val documento = Documento(rg = "178700-516",cpf = "789.456.123-78")
    val(rg,cpf) = documento
    // destructing declaration
    println("rg: $rg e cpf: $cpf")
    val documento2 = Documento(rg = "178700-516",cpf = "789.456.123-78")
    val documento3: Documento = documento2.copy(rg = "45.78451-100")
    println(documento3 == documento2)


    println(lucas == lucas2)
    println(documento == documento2)
    lucas.fala()
    println(lucas)
    println(lucas2)
    println(documento)
    println(documento2)
    println(documento3)
}

class Pessoa(
    val nome: String,
    val idade: Int
){
    fun fala(){
        println("Wow, That's Amazing")
    }
}

data class Documento(
    val rg: String,
    val cpf: String
)
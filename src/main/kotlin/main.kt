import Conta
fun main() {
    println("Hello, Seja Bem Vindo(a) ao ByteBank")

    val contaLucas = Conta(titular = "Lucas Ramon",numero = 1578)
    contaLucas.titular = "jorge"
    contaLucas.deposita(587.78)
    contaLucas.saca(87.78)


    val contaAline = Conta(titular = "Aline Lima",numero = 8578)
    contaAline.deposita(78456.89)
    contaAline.saca(456.89)


    println()
    // efetuando uma transferência
    if(contaLucas.transfere(contaAline,250.00)) {
        println("Trasnferido com sucesso")
    }else {
        println("Não foi possível transferir")
    }


    println("Titular = " + contaLucas.titular)
    println("Número = " + contaLucas.numero)
    println("Saldo = " + contaLucas.saldo)

    println()

    println("Titular = " + contaAline.titular)
    println("Número = " + contaAline.numero)
    println("Saldo = " + contaAline.saldo)


}



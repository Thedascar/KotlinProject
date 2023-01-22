import Conta
fun main() {
    println("Hello, Seja Bem Vindo(a) ao ByteBank")

    val contaLucas = Conta()
    contaLucas.titular = "Lucas Ramon"
    contaLucas.numero = 1578
    contaLucas.saldo = 0.0
    contaLucas.deposita(587.78)
    contaLucas.saca(87.78)


    val contaAline = Conta()
    contaAline.titular = "Aline Lima"
    contaAline.numero = 8578
    contaAline.saldo = 0.0
    contaAline.deposita(78456.89)
    contaAline.saca(456.89)


    println()
    // efetuando uam transferência
    contaLucas.transfere(contaAline,250.00)


    println("Titular = " + contaLucas.titular)
    println("Número = " + contaLucas.numero)
    println("Saldo = " + contaLucas.saldo)

    println()

    println("Titular = " + contaAline.titular)
    println("Número = " + contaAline.numero)
    println("Saldo = " + contaAline.saldo)


}



fun testaContasDiferentes() {
    val contaCorrente = contaCorrente(
        titular = "Lucas Ramon",
        numero = 1570
    )

    val contaPoupanca = contaPoupanca(
        titular = "Aline Lima",
        numero = 7946
    )

    val contaSalario = contaSalario (
        titular = "Bob e Bacon",
        numero = 8956
        )

    println("Conta Corrente")
    println("Titular: ${contaCorrente.titular}")
    println("Número: ${contaCorrente.numero}")
    contaCorrente.deposita(1000.00)
    contaCorrente.saca(100.00)
    contaCorrente.transfere(contaPoupanca, 500.00)
    println("Após o saque e trasnferência")
    println(contaCorrente.saldo)

    println()

    println("Conta Poupança")
    println("Titular: ${contaPoupanca.titular}")
    println("Número: ${contaPoupanca.numero}")
    contaPoupanca.deposita(1000.00)
    contaPoupanca.saca(100.00)
    println("Após o saque")
    println(contaPoupanca.saldo)

    println()

    println("Conta Salario")
    println("Titular: ${contaSalario.titular}")
    println("Número: ${contaSalario.numero}")
    contaSalario.deposita(500.00)
    contaSalario.saca(200.00)
    //contaSalario.transfere(contaPoupanca, 500.00)
    println(contaSalario.saldo)
}
fun main(){
    testaContasDiferentes()
}
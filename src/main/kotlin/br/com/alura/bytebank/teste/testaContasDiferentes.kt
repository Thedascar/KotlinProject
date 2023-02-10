package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.modelo.Cliente



fun testaContasDiferentes() {
    val lucas = Cliente("Lucas Ramon","",
        endereco = Endereco(
            logradouro = "Rua Existente"
        ),1  )
    val contaCorrente = contaCorrente(
        titular = lucas,
        numero = 1570
    )

    val aline = Cliente("Aline Lima","", endereco = Endereco(
        logradouro = "Rua Santanarem"
    ),1)
    val contaPoupanca = contaPoupanca(
        titular = aline,
        numero = 7946
    )

    val baconebob = Cliente("Bacon e Bob","", endereco = Endereco(
        logradouro = "Rua Capuã"
    ),1)
    val contaSalario = contaSalario(
        titular = baconebob,
        numero = 8956
    )

    println("Conta Corrente")
    println("Titular: ${lucas.nome}")
    println("Endereço: ${contaCorrente.titular.endereco.logradouro}")
    contaCorrente.deposita(1000.00)
    contaCorrente.saca(100.00)
    contaCorrente.transfere(contaPoupanca, 500.00)
    println("Após o saque e trasnferência")
    println(contaCorrente.saldo)

    println()

    println("Conta Poupança")
    println("Titular: ${aline.nome}")
    println("Número: ${contaPoupanca.numero}")
    contaPoupanca.deposita(1000.00)
    contaPoupanca.saca(100.00)
    println("Após o saque")
    println(contaPoupanca.saldo)

    println()

    println("Conta Salario")
    println("Titular: ${baconebob.nome}")
    println("Número: ${contaSalario.numero}")
    contaSalario.deposita(500.00)
    contaSalario.saca(200.00)
    //contaSalario.transfere(contaPoupanca, 500.00)
    println(contaSalario.saldo)

    println("A ${Conta.Contador.total}")
}
fun main(){
    testaContasDiferentes()
}
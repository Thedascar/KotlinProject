package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()

    imprime(Unit)
    imprime(1)
    imprime(1.5)
    imprime(endereco)
}

fun imprime(valor: Any) : Unit{
    println(valor)
}

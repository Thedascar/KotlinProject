package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.teste.Cliente as novoCliente

fun main() {

    val client = Cliente("Lucas", "", 1)
    val novoCliente = novoCliente("Lucas R C Ass")
    println(novoCliente.nome)
}
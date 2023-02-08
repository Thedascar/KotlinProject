package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.teste.Cliente as novoCliente
import br.com.alura.bytebank.teste.testaFuncionario

fun main() {

    val client = br.com.alura.bytebank.modelo.Cliente("Lucas", "", 1)
    val novoCliente = novoCliente("Lucas R C Ass")
    println(novoCliente.nome)
}
package br.com.alura.modelo

import br.com.alura.teste.Cliente as novoCliente
import br.com.alura.teste.testaFuncionario

fun main() {

    val client = br.com.alura.modelo.Cliente("Lucas", "", 1)
    val novoCliente = novoCliente("Lucas R C Ass")
    println(novoCliente.nome)
}
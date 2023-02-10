package br.com.alura.bytebank.modelo
import br.com.alura.bytebank.teste.Cliente as novoCliente
fun main() {

    val client = br.com.alura.bytebank.modelo.Cliente("Lucas", "", endereco = Endereco(
        logradouro = "Rua rua"
    ),1)
    val novoCliente = novoCliente("Lucas")
    novoCliente.nome
}

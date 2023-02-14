package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testaAny() {
    val endereco = Endereco(logradouro = "R Existente",cep = "00000-000")
    val enderecoNovo = Endereco(logradouro = "Av Horacio Klabin",cep = "00000-000")
    println(endereco.equals(enderecoNovo))
    println(endereco.equals(endereco))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())
    println(endereco.toString())
    println(enderecoNovo.toString())


}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor
}
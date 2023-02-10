package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.modelo.Cliente

fun testaObjects(){

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha:Int) = this.senha == senha
    }
    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran,1000)
    println("Nome do cliente ${fran.nome}")


    val jame = Cliente(nome = "Jame",cpf = "",senha = 1)
    val contaPoupanca = contaPoupanca(titular = jame,numero = 1000)
    val contaCorrente = contaCorrente(titular = jame,numero = 1000)
    val contaSalario = contaSalario(titular = jame,numero = 1000)

}

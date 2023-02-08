package br.com.alura.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : br.com.alura.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 1000
){

    override val bonificacao : Double
        get() {
            return salario + salario * 0.2
        }
}
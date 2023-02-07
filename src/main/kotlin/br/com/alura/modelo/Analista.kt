package br.com.alura.modelo

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : br.com.alura.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao : Double
        get() {
            return  salario + salario * 0.2
        }
}
package br.com.alura.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : br.com.alura.bytebank.modelo.FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = 2000
){

    override val bonificacao : Double
        get() {
            return (salario + salario * 0.3)  + plr
        }
}
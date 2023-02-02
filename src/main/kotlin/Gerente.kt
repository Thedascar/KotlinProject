class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
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
class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao : Double
        get() {
            return salario + salario * 0.2
        }


    fun autenticacao(senha : Int) : Boolean{
        if(this.senha == senha){
            return true
        }
        return false
    }
}
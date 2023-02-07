package br.com.alura.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: Int
) : br.com.alura.modelo.Autenticavel {

    override fun autentica(senha : Int) : Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}
package KotlinAlura.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set
    fun registra(funcionario: Funcionario){
         this.total += funcionario.bonificacao
    }
// fun registra(gerente: KotlinAlura.modelo.Gerente){
        //     this.total += gerente.bonificacao
        //} fun registra(diretor: KotlinAlura.modelo.Diretor){
        //     this.total += diretor.bonificacao
        //}
}

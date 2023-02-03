package KotlinAlura

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set
    fun registra(funcionario: Funcionario){
         this.total += funcionario.bonificacao
    }
// fun registra(gerente: KotlinAlura.Gerente){
        //     this.total += gerente.bonificacao
        //} fun registra(diretor: KotlinAlura.Diretor){
        //     this.total += diretor.bonificacao
        //}
}

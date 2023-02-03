package KotlinAlura
abstract class ContaTrasnferivel(
    titular : String,
    numero : Int
) : Conta(
        titular = titular,
        numero = numero
    ) {

    fun transfere(contaRecebe : ContaTrasnferivel, valor : Double) : Boolean{
        if(this.saldo >= valor){
            this.saldo -= (valor)
            contaRecebe.deposita(valor)
            return true
        }
            return false
    }


}



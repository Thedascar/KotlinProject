package br.com.alura.modelo

abstract class ContaTrasnferivel(
    titular : String,
    numero : Int
) : br.com.alura.modelo.Conta(
        titular = titular,
        numero = numero
    ) {

    fun transfere(contaRecebe : br.com.alura.modelo.ContaTrasnferivel, valor : Double) : Boolean{
        if(this.saldo >= valor){
            this.saldo -= (valor)
            contaRecebe.deposita(valor)
            return true
        }
            return false
    }


}



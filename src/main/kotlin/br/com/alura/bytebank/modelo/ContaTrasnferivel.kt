package br.com.alura.bytebank.modelo

abstract class ContaTrasnferivel(
    titular : String,
    numero : Int
) : br.com.alura.bytebank.modelo.Conta(
        titular = titular,
        numero = numero
    ) {

    fun transfere(contaRecebe : br.com.alura.bytebank.modelo.ContaTrasnferivel, valor : Double) : Boolean{
        if(this.saldo >= valor){
            this.saldo -= (valor)
            contaRecebe.deposita(valor)
            return true
        }
            return false
    }


}



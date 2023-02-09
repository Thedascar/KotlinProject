package br.com.alura.bytebank.modelo

abstract class ContaTrasnferivel(
    titular : Cliente,
    numero : Int
) : Conta(
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



package br.com.alura.modelo
abstract class Conta(
    var titular : String,
    val numero : Int) {
    var saldo = 0.0
        protected set

    //constructor(titular : String,numero : Int){
    //    this.titular = titular
    //   this.numero = numero
    //}


    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor : Double)

    // metodos getter e setter


    //fun getSaldo() : Double{
    //    return this.saldo
    //}

    // fun setSaldo(valor : Double){
    //    if(saldo > 0){
    //        this.saldo = valor
    //        return
    //    }
    //}
}



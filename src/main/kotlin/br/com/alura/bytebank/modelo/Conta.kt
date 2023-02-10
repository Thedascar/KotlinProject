package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular : Cliente,
    val numero : Int) {
    var saldo = 0.0
        protected set
     companion object Contador {
        var total = 0
            private set
    }
    init{
        println("Criando Conta ")
        Contador.total++
    }

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


class contaCorrente(
    titular: Cliente,
    numero: Int

) : ContaTrasnferivel(
    titular = titular,
    numero = numero)
{
    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class contaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTrasnferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }
}
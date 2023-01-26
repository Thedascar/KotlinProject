
open class Conta(var titular : String, val numero : Int) {
    var saldo = 0.0
        private set

    //constructor(titular : String,numero : Int){
    //    this.titular = titular
    //   this.numero = numero
    //}


    fun deposita(valor : Double){
        if(valor > 0) {
            this.saldo += valor
        }
    }

    open fun saca(valor : Double){
        if(this.saldo > valor){
            this.saldo -= valor
        }
    }

    fun transfere(contaRecebe : Conta,valor : Double) : Boolean{
        if(this.saldo > valor){
            this.saca(valor)
            contaRecebe.deposita(valor)
            return true
        }
            return false
    }

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



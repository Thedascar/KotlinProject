class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor : Double){
        this.saldo += valor
    }

    fun saca(valor : Double){
        if(this.saldo > valor){
            this.saldo -= valor
        }
    }

    fun transfere(contaRecebe : Conta,valor : Double){
        if(this.saldo > valor){
            val valorDaTrasnferencia = valor
            val titular = this.titular
            val quemRecebe = contaRecebe.titular
            this.saldo -= valor
            contaRecebe.saldo += valor
            println("O $titular fez uma transferência para $quemRecebe no valor de R$: $valorDaTrasnferencia")
            return
        }
        println("O valor está acima do saldo")
    }
}

package br.com.alura.bytebank.modelo

class contaCorrente(
    titular: String,
    numero: Int
) : br.com.alura.bytebank.modelo.ContaTrasnferivel(
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
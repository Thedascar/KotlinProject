package br.com.alura.modelo

class contaCorrente(
    titular: String,
    numero: Int
) : br.com.alura.modelo.ContaTrasnferivel(
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
package br.com.alura.bytebank.modelo

class contaPoupanca(
    titular: String,
    numero: Int
) : br.com.alura.bytebank.modelo.ContaTrasnferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }
}
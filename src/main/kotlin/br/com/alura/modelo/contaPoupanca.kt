package br.com.alura.modelo

class contaPoupanca(
    titular: String,
    numero: Int
) : br.com.alura.modelo.ContaTrasnferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }

    }
}